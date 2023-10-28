#include <GL/freeglut.h>
#include<GL/gl.h>
#include<iostream>

using namespace std;

int p=0,q=0,r=250;

void putPixel(float x, float y)
{
	glColor3f(1,1,1);
	glBegin(GL_POINTS);
		glVertex2f(x,y);
	glEnd();
	glFlush();
}

void bresenCircle(float p, float q, float r)
{
	float x, y, d;
	
	d = 3 - 2*r;
	
	x = 0;
	y = r;
	
	while(x <= y)
	{
		putPixel(x+p, y+q);
		putPixel(y+p, x+q);
		putPixel(-y+p, x+q);
		putPixel(-x+p, y+q);
		putPixel(-x+p, -y+q);
		putPixel(-y+p, -x+q);
		putPixel(y+p, -x+q);
		putPixel(x+p, -y+q);
		
		if(d < 0)
			d += 4*x + 6;
		else
		{
			y--;
			d += 4*(x - y) + 10;
		}
		x++;
	}
	glFlush();
}

void draw()
{
	// int x,y,r;
	// cout<<"Enter the co-ordinates Center of Circle : \n";
	// cout<<"Enter x : ";
	// cin>>x;
	// cout<<"Enter y : ";
	// cin>>y;
	// cout<<"Enter radius : ";
	// cin>>r;
	
	glClearColor(0,0,0,0);
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1,1,1);
	gluOrtho2D(-750, 750, -450, 450);	
	
	bresenCircle(0,0,r);
	bresenCircle(0,0,r/2);
	bresenCircle(0,r,r/2);
	bresenCircle(0,-r,r/2);
	bresenCircle(r*0.866,r/2,r/2);
	bresenCircle(-r*0.866,r/2,r/2);
	bresenCircle(-r*0.866,-r/2,r/2);
	bresenCircle(r*0.866,-r/2,r/2);
	
	glFlush();
}

void keyboardListen(unsigned char key, int x, int y){
    cout << "Radius entered is " << key << endl;
    cout << "Center of circle is " << p << ", " << q << endl;
    r =  (key - '0') * 50;
    draw();
}

void mouseListner(int button,int state,int x,int y){
    cout << "Mouse clicked cordinates are (" << x << ", " << y << ")" << endl;
    cout << "Enter the circle radius: " << endl;
    p = x;
    q = y;
    glutKeyboardFunc(keyboardListen);    
}

int main(int argc, char** argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE);
	glutInitWindowPosition(100,100);
	glutInitWindowSize(1500,900);
	glutCreateWindow("Circular Pattern");
    glutMouseFunc(mouseListner);
	glutMainLoop();
	return 0;
}