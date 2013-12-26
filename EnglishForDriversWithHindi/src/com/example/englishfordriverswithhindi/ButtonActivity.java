package com.example.englishfordriverswithhindi;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

//add
import android.widget.ImageButton;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.media.MediaPlayer;

public class ButtonActivity extends Activity {
MediaPlayer mpButtonClick1;
MediaPlayer mpButtonClick2;
MediaPlayer mpButtonClick3;
MediaPlayer mpButtonClick4;
MediaPlayer mpButtonClick5;
MediaPlayer mpButtonClick6;
MediaPlayer mpButtonClick7;
MediaPlayer mpButtonClick8;
MediaPlayer mpButtonClick9;
MediaPlayer mpButtonClick10;
MediaPlayer mpButtonClick11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        
        ImageView imageView1;
        imageView1 = (ImageView) findViewById(R.id.imageView1); 
        
        //add
        ImageButton imageButton1;
        imageButton1 = (ImageButton) findViewById(R.id.imagebutton1);
        //add button 1 code

   
        
        //add
        imageButton1 = (ImageButton) findViewById(R.id.imagebutton1);
       
        mpButtonClick1 = MediaPlayer.create(this, R.raw.hello);
        
      
        //add button sound
        
        //set-up button sound
        imageButton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mpButtonClick1.start();
			}
			
        	});
			////finish button 1 code
            ImageButton imageButton2;           
	        //add button 2 code
	        mpButtonClick2 = MediaPlayer.create(this, R.raw.morning);
	        
	        //add
	        imageButton2 = (ImageButton) findViewById(R.id.imagebutton2);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick2.start();
				}
	        });
			////finish button 2 code  
	        //add button 3 code
	        ImageButton imageButton3;   
	        mpButtonClick3 = MediaPlayer.create(this, R.raw.nicetomeetyou);
	        
	        //add
	        imageButton3 = (ImageButton) findViewById(R.id.imagebutton3);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick3.start();
				}
	        });
			////finish button 3 code    
	      //add button 4 code
	        ImageButton imageButton4;   
	        mpButtonClick4 = MediaPlayer.create(this, R.raw.howareyou);	        
	        //add
	        imageButton4 = (ImageButton) findViewById(R.id.imagebutton4);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick4.start();
				}
	        });
			////finish button 4 code
	        //add button 5 code
	        ImageButton imageButton5;   
	        mpButtonClick5 = MediaPlayer.create(this, R.raw.wherewouldyouliketogo);
	        
	        //add
	        imageButton5 = (ImageButton) findViewById(R.id.imagebutton5);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick5.start();
				}
	        });
			////finish button 5 code  	  	        
	        //add button 6 code
	        ImageButton imageButton6;   
	        mpButtonClick6 = MediaPlayer.create(this, R.raw.whatstheaddress);
	        
	        //add
	        imageButton6 = (ImageButton) findViewById(R.id.imagebutton6);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick6.start();
				}
	        });
			////finish button 6 code  

	        //add button 8 code
	        ImageButton imageButton8;   
	        mpButtonClick8 = MediaPlayer.create(this, R.raw.heresmynumber);
	        
	        //add
	        imageButton8 = (ImageButton) findViewById(R.id.imagebutton8);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick8.start();
				}
	        });
			////finish button 8 code  	  	
	        //add button 9 code
	        ImageButton imageButton9;   
	        mpButtonClick9 = MediaPlayer.create(this, R.raw.illcallbacklater);
	        
	        //add
	        imageButton9 = (ImageButton) findViewById(R.id.imagebutton9);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick9.start();
				}
	        });
			////finish button 9 code  	  	
	        //add button 10 code
	        ImageButton imageButton10;   
	        mpButtonClick10 = MediaPlayer.create(this, R.raw.thankyou);
	        
	        //add
	        imageButton10 = (ImageButton) findViewById(R.id.imagebutton10);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick10.start();
				}
	        });
			////finish button 10 code  	  	
	        //add button 11 code
	        ImageButton imageButton11;   
	        mpButtonClick11 = MediaPlayer.create(this, R.raw.goodnight);
	        
	        //add
	        imageButton11 = (ImageButton) findViewById(R.id.imagebutton11);
	      
	        //add button sound
	        
	        //set-up button sound
	        imageButton11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					mpButtonClick11.start();
				}
	        });
			////finish button 11 code  	  		        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.button, menu);
        return true;
    }
    
}
