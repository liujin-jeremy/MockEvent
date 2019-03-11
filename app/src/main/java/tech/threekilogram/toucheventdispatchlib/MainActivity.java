package tech.threekilogram.toucheventdispatchlib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import tech.threekilogram.mockevent.MockEvent;

public class MainActivity extends AppCompatActivity {

      private static final String TAG = MainActivity.class.getSimpleName();

      private MockEvent     mMockEvent = new MockEvent();
      private TestImageView mImage;

      @Override
      protected void onCreate ( Bundle savedInstanceState ) {

            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_main );
            initView();
      }

      private void initView ( ) {

            mImage = findViewById( R.id.image );
      }

      public void down ( View view ) {

            mMockEvent.dispatchDown( mImage );
      }

      public void move ( View view ) {

            mMockEvent.dispatchMoveBy( mImage, 50, 50 );
      }

      public void up ( View view ) {

            mMockEvent.dispatchUp( mImage );
      }

      public void move2 ( View view ) {

            mMockEvent.dispatchMoveBy( mImage, -50, -50 );
      }
}
