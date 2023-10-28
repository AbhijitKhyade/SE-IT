#include <GL/freeglut.h>
#include <GL/gl.h>
#include <iostream>
using namespace std;

#define sign(x) ((x > 0) ? 1 : ((x < 0) ? -1 : 0))

void putPixel(float x, float y)
{
	glBegin(GL_POINTS);
	glVertex2f(x, y);
	glEnd();
	glFlush();
}

struct point
{
	GLint x;
	GLint y;
};

struct point p1, p2;

void dda(point p1, point p2, int line_type)
{
	float dx, dy, xinc, yinc, x, y, steps;
	dx = p2.x - p1.x;
	dy = p2.y - p1.y;

	if (abs(dx) > abs(dy))
		steps = dx;
	else
		steps = dy;

	xinc = dx / steps;
	yinc = dy / steps;

	x = p1.x;
	y = p1.y;

	putPixel(x, y);
	for (int i = 0; i < steps; i++)
	{
		x += xinc;
		y += yinc;

		switch (line_type)
		{
		case 1:
			putPixel(x, y);
			break;
		case 2:
			if (i % 7 == 0)
				putPixel(x, y);
			break;
		case 3:
			if ((i / 10) & 1)
				putPixel(x, y);
			
			break;
		case 4:
			glPointSize(2);
			putPixel(x, y);
		}
	}
}

void bline(point p1, point p2, int line_type)
{
	float dx, dy, p, x, y, temp, xc, yc, swap = 0;
	dx = abs(p2.x - p1.x);
	dy = abs(p2.y - p1.y);
	xc = sign(p2.x - p1.x);
	yc = sign(p2.y - p1.y);
	if (dy > dx)
	{
		temp = dx;
		dx = dy;
		dy = temp;
		swap = 1;
	}

	p = 2 * dy - dx;
	x = p1.x;
	y = p1.y;
	// putPixel(x,y);

	int i;
	for (i = 1; i <= dx; i++)
	{
		switch (line_type)
		{
		case 1:
			putPixel(x, y);
			break;
		case 2:
			if (i % 7 == 0)
				putPixel(x, y);
			break;
		case 3:
			if ((i / 10) & 1)
				putPixel(x, y);
			break;
		case 4:
			glPointSize(2);
			putPixel(x, y);
		}

		if (p >= 0)
		{
			if (swap)
				x += xc;
			else
				y += yc;
			p += 2 * (-dx);
		}
		if (swap)
			y += yc;
		else
			x += xc;
		p += 2 * dy;
	}
}

void menu()
{
	bool loop = 1;
	while (loop)
	{
		cout << "\nDraw a line using :\n1)DDA\t\t2)Bresenham\t\t3)Exit\n";
		int choice, line_type;
		cin >> choice;
		if (choice != 3)
		{
			cout << "\nWhich line do you want to display:\n";
			cout << "1)Simple Line\t2)Dotted line\t3)Dashed line\t4)Bold Line\n";
			cin >> line_type;

			cout << "\nEnter Coordinates of lines..\n";
			cout << "x1 = ";
			cin >> p1.x;
			cout << "y1 = ";
			cin >> p1.y;
			cout << "x2 = ";
			cin >> p2.x;
			cout << "y2 = ";
			cin >> p2.y;
			cout << endl;
		}

		switch (choice)
		{
		case 1:
			dda(p1, p2, line_type);
			break;
		case 2:
			glColor3f(1.0, 1.0, 0.0);
			bline(p1, p2, line_type);
			break;
		case 3:
			loop = 0;
			break;
		default:
			cout << "----------Enter correct choice------\n";
		}
	}
	glFlush();
}

void mouse(int button, int state, int x, int y)
{
	glColor3f(1.0, 1.0, 0.0);
	static int r = 0;													// for checking input points alternatively
	if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN && r % 2 == 0) // first point input
	{
		p1.x = x;
		p2.y = 450 - y;
		r++;
	}
	else if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN && r % 2 == 1) // next point
	{
		p2.x = x;
		p2.y = 450 - y;
		bline(p1, p2, 1);
		p1 = p2;
	}
	else if (button == GLUT_LEFT_BUTTON && state == GLUT_DOWN)
		r = 0;
}

void draw()
{
	glClearColor(0, 0, 0, 0);
	glClear(GL_COLOR_BUFFER_BIT);
	glColor3f(1.0, 1.0, 1.0);
	gluOrtho2D(-750, 750, -450, 450);

	menu();

	glFlush();
}

int main(int argc, char **argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE);
	glutInitWindowPosition(100, 100);
	glutInitWindowSize(1500, 900);
	glutCreateWindow("ALL");
	glutDisplayFunc(draw);
	glutMouseFunc(mouse);
	glutMainLoop();
	return 0;
}
