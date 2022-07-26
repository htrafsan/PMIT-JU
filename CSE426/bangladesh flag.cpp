#include<windows.h>
#include<GL/glut.h>
#include<math.h>
#define pi 3.14159265

float r = 0.4;

void display(){


    glBegin(GL_QUADS);

    glColor3f(0,0.40,0.28);
    glVertex2f(1,0.6);//W:H=5:3=1:0.6
    glVertex2f(1,-0.6);
    glVertex2f(-1,-0.6);
    glVertex2f(-1,0.6);


    glEnd();

    glBegin(GL_POLYGON); //Using polygon fills the circle. //GL_POINTS
    for (float theta=0; theta<360; theta+=0.001){
        float x = r * cos(theta);
        float y = r * sin(theta);
        glColor3f(0.85,0.16,0.11);
        glVertex2f(x,y);
    }
    glEnd();


    glFlush();


 }

int main(int argc, char **argv){

    glutInit(&argc, argv); //initialize glut package
    glutInitDisplayMode(GLUT_SINGLE); //could be double or rgb. for non moving object display single. for moving object double
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100,100);
    glutCreateWindow("Rafsan");
    glutDisplayFunc(display); //calling display function
    glutMainLoop(); // if not mentioned the graphic window will blink once and gone
    return 0;

 }
