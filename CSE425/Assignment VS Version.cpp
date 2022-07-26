/*
Hasan Tahsin Rafsan
Assignment CSE425
*/

#include <windows.h>
#include <GL/glut.h>
#include <stdio.h>

float angle = 0;
int togglecolor_counter = 0;
int smoothcolor_counter = 0;
int Materialfv_switch=0;
int rotation_lock=0;
int mouse_rotation_zoom_lock=0;



GLfloat rotX = 0.0f; // Rotate screen on x axis
GLfloat rotY = 0.0f; // Rotate screen on y axis
GLfloat rotZ = 0.0f; // Rotate screen on z axis
GLfloat rotLx = 0.0f; // Translate screen by using the glulookAt function (left or right)
GLfloat rotLy = 0.0f; // Translate screen by using the glulookAt function (up or down)
GLfloat rotLz = 0.0f; // Translate screen by using the glulookAt function (zoom in or out)


GLfloat lightXPos = 1.0f;
GLfloat lightYPos = 1.0f;


float r=0.5,g=0.5,b=0.9;

float toggle_colors_code[8][3] = {{0.5, 0.5, 0.9},
                                {1, 0, 0},
                                {0, 1, 0},
                                {0, 0, 1},
                                {1, 1, 0},
                                {0, 1, 1},
                                {1, 0, 1},
                                {0, 0.8, 0.9}};

float transition_colors_code[35][3] = {{0.1, 0, 0},
                                 {0.2, 0, 0},
                                 {0.3, 0, 0},
                                 {0.4, 0, 0},
                                 {0.5, 0, 0},
                                 {0.6, 0, 0},
                                 {0.7, 0, 0},
                                 {0.8, 0, 0},
                                 {0.9, 0, 0},
                                 {0.8, 0.1, 0},
                                 {0.6, 0.1, 0},
                                 {0.4, 0.1, 0},
                                 {0.2, 0.2, 0},
                                 {0, 0.3, 0},
                                 {0, 0.4, 0},
                                 {0, 0.5, 0},
                                 {0, 0.6, 0},
                                 {0, 0.7, 0},
                                 {0, 0.8, 0},
                                 {0, 0.9, 0},
                                 {0, 0.8, 0},
                                 {0, 0.6, 0.1},
                                 {0, 0.4, 0.1},
                                 {0, 0.3, 0.1},
                                 {0, 0.2, 0.1},
                                 {0, 0, 0.2},
                                 {0, 0, 0.3},
                                 {0, 0, 0.4},
                                 {0, 0, 0.5},
                                 {0, 0, 0.6},
                                 {0, 0, 0.7},
                                 {0, 0, 0.8},
                                 {0, 0, 0.9},
                                 {0, 0, 1}};

void display(void)
{

    const double t = glutGet(GLUT_ELAPSED_TIME) / 1000.0;
    const double a = t*90.0;
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);

    glPushMatrix();
        glTranslated(0,0,-6);
        glRotated(0,1,0,0);
        if (rotation_lock==1) //If auto rotate enabled
        {

            glRotated(a,0,0,1);
        }


    //glLoadIdentity();
    //gluLookAt(0, 0, 5, 0, 0, 0, 0, 1, 0);
    //glColor3f(r, g, b);
    glutSolidTeapot(1.0);

    glPopMatrix();

    if (Materialfv_switch==0){
    glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE, toggle_colors_code[togglecolor_counter]);}
    else{
    glMaterialfv(GL_FRONT_AND_BACK, GL_AMBIENT_AND_DIFFUSE, transition_colors_code[smoothcolor_counter]);}
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
	GLfloat Lt0pos[] = {lightXPos, lightYPos, 5.0f, 1.0f};
    glLightfv(GL_LIGHT0, GL_DIFFUSE, Lt0diff);
    glLightfv(GL_LIGHT0, GL_POSITION, Lt0pos);
    glutSwapBuffers();
    glFlush();


}

void togglecolors()
{
if (togglecolor_counter<8)
{
    Materialfv_switch=0;
    r=toggle_colors_code[togglecolor_counter][0];
    g=toggle_colors_code[togglecolor_counter][1];
    b=toggle_colors_code[togglecolor_counter][2];
    togglecolor_counter=togglecolor_counter+1;
}

else if (togglecolor_counter==8)
{
    Materialfv_switch=0;
    togglecolor_counter=0;
}

}


void transitioncolors(){

if (smoothcolor_counter<34)
{
    Materialfv_switch=1;
    r=transition_colors_code[smoothcolor_counter][0];
    g=transition_colors_code[smoothcolor_counter][1];
    b=transition_colors_code[smoothcolor_counter][2];
    smoothcolor_counter=smoothcolor_counter+1;
}
else if (smoothcolor_counter==34){
    Materialfv_switch=1;
    smoothcolor_counter=0;
}
}

static void keyboard(unsigned char key, int x, int y)
{
    switch(key)
    {
    case 'c':
        togglecolors();
        glutPostRedisplay();
        break;
    case 't':
        transitioncolors();
        glutPostRedisplay();
        break;

    case 'r': //Enable/Disable auto rotation
            if(rotation_lock==0)
                rotation_lock=1;
            else
                rotation_lock=0;
            break;

    case 27 : //exit when ESC is pressed

    case 'q': //exit when q is pressed
            exit(0);
            break;

    case 'e': //Switch between rotation or zoom using mouse action
            if(mouse_rotation_zoom_lock==0)
                mouse_rotation_zoom_lock=1;
            else
                mouse_rotation_zoom_lock=0;
            break;

    case 'o':

    rotX = 0.0f;
    rotY = 0.0f;
    rotZ = 0.0f;
    rotLx = 0.0f;
    rotLy = 0.0f;
    rotLz = 0.0f;
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
    gluLookAt(0, 0, 5.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
    break;

    default:
        printf("Unhandled key press %c\n",key);
    }
    glutPostRedisplay();

}

void specialFunc( int key, int x, int y )
{
    switch(key)
    {
    case GLUT_KEY_UP:  //UP key to move the light source UP
		lightYPos += 0.5f;
		break;

    case GLUT_KEY_DOWN:  //DOWN key to move the light source DOWN
		lightYPos += -0.5f;
		break;

    case GLUT_KEY_LEFT:  //LEFT key to move the light source LEFT
		lightXPos += -0.5f;
		break;

    case GLUT_KEY_RIGHT:  //RIGHT key to move the light source RIGHT
		lightXPos += 0.5f;
		break;
    }
	// this will refresh the screen so that the user sees the light position
    glutPostRedisplay();
}

void reshape(int w, int h)
{
    glViewport(0, 0, w, h);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluPerspective(60, w/h, 1, 100);
    glMatrixMode(GL_MODELVIEW);
}

void mouse(int button, int state, int mousex, int mousey)
{
    if (mouse_rotation_zoom_lock==1) // If rotation enabled
    {
        if(button==GLUT_LEFT_BUTTON && state==GLUT_UP)
        {
            glRotatef(25,0,0,1);
        }

        else if(button==GLUT_RIGHT_BUTTON && state==GLUT_DOWN)
        {
            glRotatef(-25,0,0,1);
        }
    }

    else // If zoom enabled
    {
        if(button==GLUT_LEFT_BUTTON && state==GLUT_UP) //zoom in
        {

            rotLz -= 0.2f;
            glMatrixMode(GL_MODELVIEW);
            glLoadIdentity();
            gluLookAt (rotLx, rotLy, 5.0 + rotLz, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);

        }

        else if(button==GLUT_RIGHT_BUTTON && state==GLUT_DOWN) //zoom out
        {
            rotLz += 0.2f;
            glMatrixMode(GL_MODELVIEW);
            glLoadIdentity();
            gluLookAt (rotLx, rotLy, 5.0 + rotLz, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0);

        }
    }

    glutPostRedisplay();
}

static void idle(void)
{
    glutPostRedisplay();
}

int main(int argc, char** argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_RGB | GLUT_DOUBLE | GLUT_DEPTH);
    glutInitWindowSize(800,800);
    glutInitWindowPosition(200,200);
    glutCreateWindow("rafsan");
    glutReshapeFunc(reshape);
    glutDisplayFunc(display);
    glutKeyboardFunc(keyboard);
    glutSpecialFunc(specialFunc);
    glutMouseFunc(mouse);

    glutIdleFunc(idle);



    glEnable(GL_DEPTH_TEST);
    glDepthFunc(GL_LESS);

    glEnable(GL_LIGHT0);
    glEnable(GL_NORMALIZE);
    glEnable(GL_LIGHTING);

    glutMainLoop();
    return 0;
}
