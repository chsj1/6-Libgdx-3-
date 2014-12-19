package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {

	Texture texture;
	TextureRegion region;
	Sprite sprite;
	
	
	SpriteBatch batch;
	
	@Override
	public void create() {
		texture = new Texture(Gdx.files.internal("data/test1.jpg"));
		region = new TextureRegion(texture);
		sprite = new Sprite(region);
		sprite.setPosition(200, 200);//����λ��
//		sprite.setColor(Color.BLUE);//������ɫ
//		sprite.setRotation(90);//������ת��
		sprite.setRotation(45);//������ת��
//		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setOrigin(0, 0);//����ê��,��ת��ʱ����Ҫ�õ�.һ���setRotationһ��ʹ��.�����ê����������Լ�������
//		sprite.setOrigin(sprite.getX(), sprite.getY());
		sprite.setSize(256, 256);//���ô�С
		
		batch = new SpriteBatch();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}
	
	
	
	
	@Override
	public void render() {
		Gdx.gl.glClearColor(1, 1, 1, 1);// ���ñ���Ϊ��ɫ
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// ����
		
		
		batch.begin();
		
		sprite.draw(batch);//�Ѿ�����Ƴ���
		
		batch.end();
	}

	@Override
	public void resize(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

}
