package razerdp.friendcircle.widget.pullrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

import razerdp.friendcircle.R;
import razerdp.friendcircle.widget.pullrecyclerview.interfaces.CirclePtrRefreshView;
import razerdp.friendcircle.widget.pullrecyclerview.interfaces.PtrState;

/**
 * Created by 大灯泡 on 2016/10/29.
 * <p>
 * 朋友圈下拉头部
 */

public class CirclePtrFooterView extends FrameLayout implements CirclePtrRefreshView {
    private onRecyclerPullListener onRecyclerPullListener;

    public CirclePtrFooterView(Context context) {
        this(context, null);
    }

    public CirclePtrFooterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CirclePtrFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.view_ptr_header, this);
    }

    public razerdp.friendcircle.widget.pullrecyclerview.onRecyclerPullListener getOnRecyclerPullListener() {
        return onRecyclerPullListener;
    }

    public void setOnRecyclerPullListener(razerdp.friendcircle.widget.pullrecyclerview.onRecyclerPullListener onRecyclerPullListener) {
        this.onRecyclerPullListener = onRecyclerPullListener;
    }


    @Override
    public void onRefreshing() {

    }

    @Override
    public void onCompelete() {

    }

    @Override
    public void onStart(PtrState state, int positionForRefresh) {

    }

    @Override
    public void onMoved(PtrState state, int positionForRefresh, int offsetY) {

    }

    @Override
    public void onRelease(PtrState state, int positionForRefresh, int offsetY) {

    }

    @Override
    public void onReset(PtrState state, int positionForRefresh) {

    }

}
