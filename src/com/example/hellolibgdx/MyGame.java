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
		sprite.setPosition(200, 200);//设置位置
//		sprite.setColor(Color.BLUE);//设置颜色
//		sprite.setRotation(90);//设置旋转角
		sprite.setRotation(45);//设置旋转角
//		sprite.setOrigin(sprite.getWidth()/2, sprite.getHeight()/2);
		sprite.setOrigin(0, 0);//设置锚点,旋转的时候需要用到.一般和setRotation一起使用.这里的锚点是相对于自己的坐标
//		sprite.setOrigin(sprite.getX(), sprite.getY());
		sprite.setSize(256, 256);//设置大小
		
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
		Gdx.gl.glClearColor(1, 1, 1, 1);// 设置背景为白色
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);// 清屏
		
		
		batch.begin();
		
		sprite.draw(batch);//把精灵绘制出来
		
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
