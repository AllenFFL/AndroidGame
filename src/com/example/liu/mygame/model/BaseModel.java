package com.example.liu.mygame.model;

import android.graphics.Canvas;
import android.graphics.Paint;

public class BaseModel {
	// �����࣬����������չʾ����Ļ�ϵĶ�̬����Ҫ�̳��Դ���

	// λ��
	private int locationX;
	private int locationY;
	// ����
	private boolean isAlife;

	// �����Լ������ƶ�
	public void drawSelf(Canvas canvas, Paint paint) {

	}

	public int getModelWidth() {
		return 0;
	}

	public int getLocationX() {
		return locationX;
	}

	public void setLocationX(int locationX) {
		this.locationX = locationX;
	}

	public int getLocationY() {
		return locationY;
	}

	public void setLocationY(int locationY) {
		this.locationY = locationY;
	}

	public boolean isAlife() {
		return isAlife;
	}

	public void setAlife(boolean isAlife) {
		this.isAlife = isAlife;
	}

}
