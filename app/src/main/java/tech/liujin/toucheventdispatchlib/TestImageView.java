package tech.liujin.toucheventdispatchlib;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * @author Liujin 2019/3/11:20:34:47
 */
public class TestImageView extends android.support.v7.widget.AppCompatImageView {

      private static final String TAG = TestImageView.class.getSimpleName();

      private float mDownX;
      private float mDownY;
      private float mLastX;
      private float mLastY;

      public TestImageView ( Context context ) {

            super( context );
      }

      public TestImageView ( Context context, AttributeSet attrs ) {

            super( context, attrs );
      }

      public TestImageView ( Context context, AttributeSet attrs, int defStyleAttr ) {

            super( context, attrs, defStyleAttr );
      }

      @Override
      public boolean onTouchEvent ( MotionEvent event ) {

            switch( event.getAction() ) {
                  case MotionEvent.ACTION_DOWN:
                        mDownX = mLastX = event.getX();
                        mDownY = mLastY = event.getY();
                        Log.i( TAG, "onTouchEvent: down->" + mDownX + "-" + mDownY );
                        break;

                  case MotionEvent.ACTION_MOVE:
                        float x = event.getX();
                        float y = event.getY();
                        float dx = x - mLastX;
                        float dy = y - mLastY;
                        mLastX = x;
                        mLastY = y;
                        Log.i( TAG, "onTouchEvent: move->" + mLastX + "-" + mLastY + " : " + dx + "-" + dy );
                        scrollBy( (int) dx, (int) dy );
                        break;

                  case MotionEvent.ACTION_UP:
                        Log.i( TAG, "onTouchEvent: up->" + event.getX() + "-" + event.getY() );
                        break;
            }

            return true;
      }
}
