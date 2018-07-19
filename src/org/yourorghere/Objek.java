package org.yourorghere;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;


public class Objek {

    static void kepala(GL gl) {
        float BODY_RADIUS = 2f;
        int SLICES = 100;
        int STACKS = 100;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluSphere(q, BODY_RADIUS, SLICES, STACKS);
    }
    static void badan(GL gl) {
        float amb[] = {0.34f, 0.34f, 0.34f, 1};
        float diff[] = {0.41f, 0.41f, 0.41f, 1};
        float spec[] = {0.11f, 0.11f, 0.11f, 1};
        float shine = 200;

        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_AMBIENT, amb, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_DIFFUSE, diff, 0);
        gl.glMaterialfv(GL.GL_FRONT_AND_BACK, GL.GL_SPECULAR, spec, 0);
        gl.glMaterialf(GL.GL_FRONT_AND_BACK, GL.GL_SHININESS, shine);
        float BODY_LENGTH = 4f;
        float BODY_RADIUS = 2.0f;
        int SLICES = 30;
        int STACKS = 30;
        GLU glu = new GLU();
        GLUquadric q = glu.gluNewQuadric();
        glu.gluCylinder(q, BODY_RADIUS, BODY_RADIUS, BODY_LENGTH, SLICES, STACKS);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
        gl.glTranslatef(0.0f, 0.0f, BODY_LENGTH);
        glu.gluDisk(q, 0.0f, BODY_RADIUS, SLICES, STACKS);
    }
    static void tangankanan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri            
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void tangankiri(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }
    static void kakikanan(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }

    static void kakikiri(GL gl) {
        gl.glBegin(GL.GL_POLYGON);//kiri
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(0, 1, 3);//3
        gl.glVertex3f(0, 0, 3);//4
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//atas
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(0, 1, 0);//2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//belakang
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 0, 0);//1
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(1, 0, 0);//5
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//depan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(0, 1, 0);//2
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//kanan
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 0, 0);//5
        gl.glVertex3f(1, 1, 0);//6
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);//bawah
        gl.glColor3f(0.82f, 0.70f, 0.39f);
        gl.glVertex3f(1, 1, 3);//7
        gl.glVertex3f(1, 0, 3);//8
        gl.glVertex3f(0, 0, 3);//4
        gl.glVertex3f(0, 1, 3);//3
        gl.glEnd();
    }
}
