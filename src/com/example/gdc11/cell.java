package com.example.gdc11;

import android.opengl.*;

public class cell{
  private float pos[]=new float[4];
  public void Render(){
GLES20.GLfloat vertices[] = {1,0,0, 0,1,0, -1,0,0};
GLES20.glEnableClientState(GLES20.GL_VERTEX_ARRAY);
GLES20.glVertexPointer(3, GLES20.GL_FLOAT, 0, vertices);
GLES20.glDrawArrays(GLES20.GL_TRIANGLES, 0, 3);
GLES20.glDisableClientState(GLES20.GL_VERTEX_ARRAY);
  }
  public cell(float p[]){
    pos[0]=p[0];
    pos[1]=p[1];
    pos[2]=p[2];
  //  pos[3]=p[3];
  }
}
