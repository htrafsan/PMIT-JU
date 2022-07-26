/*
Inputs are:
0.8 0.2 0.8 0.4
0.1 0.9 0.9 0.1

*/
#include <windows.h>
#include <GL/glut.h>
#include <stdio.h>

float xmax, xmin, ymax, ymin;
float x1, y1, x2, y2, x3, y3, x4, y4;

float p1,p2,r1,r2;

void drawString(void *font, float x, float y, char *str)
{

    char *ch;
    glRasterPos3f(x, y,0);
    for(ch=str; *ch; ch++)
    {
        glutBitmapCharacter(font, (int)*ch);
    }

}

void display(void)
{

    glClear(GL_COLOR_BUFFER_BIT);
    glBegin(GL_QUADS);

    glColor3f(1, 1, 0);
    glVertex2f(xmin, ymax);
    glVertex2f(xmax, ymax);
    glVertex2f(xmax, ymin);
    glVertex2f(xmin, ymin);

    glEnd();
    glFlush();

    glBegin(GL_LINES);
    glColor3f(0,1,0);
    glVertex2f(x1,y1);
    glVertex2f(x2,y2);
    glEnd();
    glFlush();

    glBegin(GL_LINES);
    glColor3f(1,0,0);
    glVertex2f(p1,r1);
    glVertex2f(p2,r2);
    glEnd();
    glFlush();

    drawString(GLUT_BITMAP_TIMES_ROMAN_24, -0.75, -0.75, "Graphics Lab 4-2 A2");

}



int main(int argc, char** argv)
{
    int flag1, flag2;

    scanf("%f%f%f%f",&xmax, &xmin, &ymax, &ymin);
    scanf("%f%f%f%f", &x1, &y1, &x2, &y2);

    //First End Point
    if(x1>xmin && x1<xmax && y1>ymin && y1<ymax)
    {
        flag1 = 0; //inside
        p1=x1;
        r1=y1;
    }
    else if(x1<=xmin && y1>=ymax)
    {
        flag1 = 5; //up-left
        x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));

        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }

        x4 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y4 = ymax;

        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p1=x4;
            r1=y4;
        }
    }
    else if(x1>=xmax && y1>=ymax)
    {
        flag1 = 6; //up-right

        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }

        x4 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y4 = ymax;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p1=x4;
            r1=y4;
        }
    }
    else if(x1<=xmin && y1<=ymin)
    {
        flag1 = 7; //down-left
        x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }

        x4 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y4 = ymin;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p1=x4;
            r1=y4;
        }
    }
    else if(x1>=xmax && y1<=ymin)
    {
        flag1 = 8; //down-right
        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }

        x4 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y4 = ymin;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p1=x4;
            r1=y4;
        }
    }
    else if(y1>=ymax)
    {
        flag1 = 1; //up
        x3 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y3 = ymax;
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }
    }
    else if(y1<=ymin)
    {
        flag1 = 2; //down
        x3 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y3 = ymin;
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }

    }
    else if(x1>=xmax)
    {
        flag1 = 4; //right
        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }
    }
    else if(x1<=xmin)
    {
        flag1 = 3; //left
        x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p1=x3;
            r1=y3;
        }
    }


    //Second End Point

    if(x2>xmin && x2<xmax && y2>ymin && y2<ymax)
    {
        flag2 = 0; //inside
        p2=x2;
        r2=y2;
    }
    else if(x2<=xmin && y2>=ymax)
    {
        flag2 = 5; //up-left
        x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }

        x4 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y4 = ymax;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p2=x4;
            r2=y4;
        }
    }
    else if(x2>=xmax && y2>=ymax)
    {
        flag2 = 6; //up-right
        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
        x4 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y4 = ymax;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p2=x4;
            r2=y4;
        }
    }
    else if(x2<=xmin && y2<=ymin)
    {
        flag2 = 7; //down-left
        x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
        x4 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y4 = ymin;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p2=x4;
            r2=y4;
        }
    }
    else if(x2>=xmax && y2<=ymin)
    {
        flag2 = 8; //down-right
        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
        x4 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y4 = ymin;
        if(x4>=xmin && x4<=xmax && y4>=ymin && y4<=ymax)
        {
            p2=x4;
            r2=y4;
        }
    }
    else if(y2>=ymax)
    {
        flag2 = 1; //up
        x3 = x1+(x2-x1)*((ymax-y1)/(y2-y1));
        y3 = ymax;
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
    }
    else if(y2<=ymin)
    {
        flag2 = 2; //down
        x3 = x1+(x2-x1)*((ymin-y1)/(y2-y1));
        y3 = ymin;
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
    }
    else if(x2>=xmax)
    {
        flag2 = 4; //right
        x3 = xmax;
        y3 = y1+(y2-y1)*((xmax-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
    }
    else if(x2<=xmin)
    {
        flag2 = 3; //left
         x3 = xmin;
        y3 = y1+(y2-y1)*((xmin-x1)/(x2-x1));
        if(x3>=xmin && x3<=xmax && y3>=ymin && y3<=ymax)
        {
            p2=x3;
            r2=y3;
        }
    }

    printf("\n%d %d",flag1, flag2);

    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE);
    glutInitWindowSize(500, 500);
    glutInitWindowPosition(100,100);
    glutCreateWindow("rafsan");
    glutDisplayFunc(display);
    glutMainLoop();
    return 0;
}
