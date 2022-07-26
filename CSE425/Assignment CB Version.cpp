#include<windows.h>
#include<bits/stdc++.h>
#include <GL/glut.h>
#include <cmath>
#include <iostream>
#include <sstream>
#include <vector>

static int slices = 16;
static int stacks = 16;
int rotation_lock=0,smotoh_color_transition_lock=0,mouse_rotation_zoom_lock=0,i;
GLuint colorCounter = 0,angle=0;
GLfloat lightXPos = 0.0f;
GLfloat lightYPos = 0.0f;
GLfloat lightZPos = 0.0f;

static void resize(int width,int height)
{
    const float ar = (float) width/(float) height;  //windows size
    glViewport(0, 0, width, height);
    glMatrixMode(GL_PROJECTION); //projection
    glLoadIdentity();
    glFrustum(-ar, ar, -1.0, 1.0, 2.0, 100.0); //bottom,up,near,far value
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity() ;
}

static void display(void)
{
    const double t = glutGet(GLUT_ELAPSED_TIME)/1000.0; //time of camera/color change
    const double a = t*90.0;
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

    glPushMatrix();
        glTranslatef(0,0,-6); //translate
        glRotatef(60,1,0,0); //for y rotate part 1
        //glRotatef(60,0,0,1); //for x or z part 2

        if (rotation_lock==1) //If auto rotate enabled
        {
            glRotatef(a,0,0,1); //part 1 front view
            //glRotatef(a,0,1,0); //part 2 top view (y pt)
        }

    //glutSolidCube(1.0);
    glutSolidCone(1,1,slices,stacks);
	//glutSolidTeapot(1.0);
    //glutSolidSphere(1.0,slices,stacks);

    glPopMatrix();

    //Color for the object
    GLfloat diffColors[6][4] = {
                                {0.5, 0.5, 0.9, 1.0},
                                {0.9, 0.5, 0.5, 1.0},
                                {0.5, 0.9, 0.3, 1.0},
                                {0.9, 0.7, 0.2, 1.0},
                                {0.3, 0.8, 0.9, 1.0},
                                {1.0, 0.0, 0.0, 1.0}
                                }; //for basic color c

     GLfloat diffColors2[50][4] = {
                                 {0, 0, 0.1, 1.0},
                                 {0, 0, 0.2, 1.0},
                                 {0, 0, 0.3, 1.0},
                                 {0, 0, 0.4, 1.0},
                                 {0, 0, 0.5, 1.0},
                                 {0, 0, 0.6, 1.0},
                                 {0, 0, 0.7, 1.0},
                                 {0, 0, 0.8, 1.0},
                                 {0, 0, 0.9, 1.0},
                                 {0, 0, 1, 1.0}, //blue

                                 {0, 0.1, 1, 1.0},
                                 {0, 0.2, 1, 1.0},
                                 {0, 0.3, 1, 1.0},
                                 {0, 0.4, 1, 1.0},
                                 {0, 0.5, 1, 1.0},
                                 {0, 0.6, 1, 1.0},
                                 {0, 0.7, 1, 1.0},
                                 {0, 0.8, 1, 1.0},
                                 {0, 0.9, 1, 1.0},
                                 {0, 1, 1, 1.0}, //cyan

                                 {0.1, 1, 1, 1.0},
                                 {0.2, 1, 1, 1.0},
                                 {0.3, 1, 1, 1.0},
                                 {0.4, 1, 1, 1.0},
                                 {0.5, 1, 1, 1.0},
                                 {0.6, 1, 1, 1.0},
                                 {0.7, 1, 1, 1.0},
                                 {0.8, 1, 1, 1.0},
                                 {0.9, 1, 1, 1.0},
                                 {1, 1, 1, 1.0}, //white

                                 {1, 1, 0.9, 1.0},
                                 {1, 1, 0.8, 1.0},
                                 {1, 1, 0.7, 1.0},
                                 {1, 1, 0.6, 1.0},
                                 {1, 1, 0.5, 1.0},
                                 {1, 1, 0.4, 1.0},
                                 {1, 1, 0.3, 1.0},
                                 {1, 1, 0.2, 1.0},
                                 {1, 1, 0.1, 1.0},
                                 {1, 1, 0, 1.0}, //yellow

                                 {1, 0.9, 0, 1.0},
                                 {1, 0.8, 0, 1.0},
                                 {1, 0.7, 0, 1.0},
                                 {1, 0.6, 0, 1.0},
                                 {1, 0.5, 0, 1.0},
                                 {1, 0.4, 0, 1.0},
                                 {1, 0.3, 0, 1.0},
                                 {1, 0.2, 0, 1.0},
                                 {1, 0.1, 0, 1.0},
                                 {1, 0, 0, 1.0} //red
                                 }; //for t transition

    if(smotoh_color_transition_lock==1) //If auto color transition enabled
    {
        glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE, diffColors2[colorCounter]); //t count
    }

    else
        glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE, diffColors[colorCounter]); // c count

	// Define specular color and shininess
    GLfloat specColor[] = {1.0, 1.0, 1.0, 1.0};
    GLfloat shininess[] = {100.0};
	// Note that the specular color and shininess can stay constant
    glMaterialfv(GL_FRONT_AND_BACK, GL_SPECULAR, specColor);
    glMaterialfv(GL_FRONT_AND_BACK, GL_SHININESS, shininess);
    // Set light properties
    // Light color (RGBA)
    GLfloat Lt0diff[] = {1.0,1.0,1.0,1.0};
    // Light position
	GLfloat Lt0pos[] = {1.0f + lightXPos, 1.0f + lightYPos, 5.0f, 1.0f};
    glLightfv(GL_LIGHT0, GL_DIFFUSE, Lt0diff); //difude... fixed pt hoite light change...
    glLightfv(GL_LIGHT0, GL_POSITION, Lt0pos); //light position change
    glutSwapBuffers();
}

static void key(unsigned char key, int x, int y)
{
    switch (key)
    {
        case 'c': //Color toggle
            smotoh_color_transition_lock=0;
            colorCounter += 1;
            if(colorCounter>5) //block 1
                colorCounter=0;
            break;

        case 't': //Enable/Disable smooth color transition
            smotoh_color_transition_lock=1; //c enabled
            colorCounter += 1;
            if(colorCounter>49) //block 2
                colorCounter=0;
            break;

        case 'r': //Enable/Disable auto rotation
            if(rotation_lock==0)
                rotation_lock=1; //spin hobe
            else
                rotation_lock=0; // 2 bar r chap dile off hobe
            break;

        case 'x': //Switch between rotation or zoom using mouse action
            if(mouse_rotation_zoom_lock==0)
                mouse_rotation_zoom_lock=1;
            else
                mouse_rotation_zoom_lock=0;
            break;

        case 27 : //exit when ESC is pressed

        case 'q': //exit when q is pressed
            exit(0);
            break;

/* Extra Part
        case 'w': //Move up
            glTranslatef(0,0.1,0);
            glutPostRedisplay();
            break;

        case 's': //Move down
            glTranslatef(0,-0.1,0);
            glutPostRedisplay();
            break;

        case 'd'://Move right
            glTranslatef(0.1,0,0);
            glutPostRedisplay();
            break;

        case 'a': //Move left
            glTranslatef(-0.1,0,0);
            glutPostRedisplay();
            break;

        case '+': //smooth to spins faster
            slices++;
            stacks++;
            break;

        case '-': //rough & spins slower
            if (slices>3 && stacks>3)
            {
                slices--;
                stacks--;
            }
            break;
*/
        default:
            printf("Unhandled key press %c\n",key);

    }
    glutPostRedisplay();
}

void specialFunc( int key, int x, int y )
{
    switch (key)
    {
    case GLUT_KEY_UP:  //UP key to move the light source UP
		lightYPos += 0.5f; //ligh post change
		break;

    case GLUT_KEY_DOWN:  //DOWN key to move the light source DOWN
		lightYPos += -0.5f;
		break;

    case GLUT_KEY_LEFT: //LEFT key to move the light source LEFT
		lightXPos += -0.5f;
		break;

    case GLUT_KEY_RIGHT:  //RIGHT key to move the light source RIGHT
		lightXPos += 0.5f;
		break;
    }
	// this will refresh the screen so that the user sees the light position
    glutPostRedisplay();
}

void mouse(int button, int state, int mousex, int mousey) //mouse function
{
    if (mouse_rotation_zoom_lock==1) //zoom active //if press x
    {
        if(button==GLUT_LEFT_BUTTON && state==GLUT_UP)
        {
            glScalef(1.2,1.2,1); //zoom in x,y,z

        }

        else if(button==GLUT_RIGHT_BUTTON && state==GLUT_DOWN)
        {
            glScalef(0.7,0.7,1); //zoom out
        }
    }

    else //rotation active // if not press x
    {
        if(button==GLUT_LEFT_BUTTON && state==GLUT_UP)
        {
            glRotatef(5,0,0,1); //mouse z axis
            //glRotatef(5,1,0,0); //mouse x axis part 01
            //glRotatef(5,0,1,0); //mouse y axis part 02
        }

        else if(button==GLUT_RIGHT_BUTTON && state==GLUT_DOWN)
        {
            glRotatef(-5,0,0,1); //mouse z axis
            //glRotatef(-5,1,0,0); //mouse x axis part 01
            //glRotatef(-5,0,1,0); //mouse y axis part 02
        }
    }
    glutPostRedisplay();
}

static void idle(void)
{
    glutPostRedisplay(); //just display... do nothing while idle
}

int main(int argc, char *argv[])
{
    glutInit(&argc, argv);
    glutInitWindowSize(400,400); //window size
    glutInitWindowPosition(50,50); //window position
    glutInitDisplayMode(GLUT_RGB | GLUT_DOUBLE | GLUT_DEPTH);
    glutCreateWindow("18101009_CSE425_Assignment");
    glutReshapeFunc(resize); //reshape & resize function
    glutDisplayFunc(display); //display function call
    glutKeyboardFunc(key); //keyboard function call
    glutSpecialFunc(specialFunc); //special fuction call
    glutMouseFunc(mouse); //mouse function call
    glutIdleFunc(idle); //idle function.. do nothing

    //glClearColor(1,1,1,1);
    glEnable(GL_CULL_FACE);
    glCullFace(GL_BACK);
    glEnable(GL_DEPTH_TEST);
    glDepthFunc(GL_LESS);
    glEnable(GL_LIGHT0);
    glEnable(GL_NORMALIZE);
    glEnable(GL_LIGHTING); //lighting
    glutMainLoop();//main function
    return EXIT_SUCCESS;
}
