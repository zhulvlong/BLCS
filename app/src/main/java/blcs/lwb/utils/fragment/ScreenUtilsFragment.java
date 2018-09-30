package blcs.lwb.utils.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import blcs.lwb.lwbtool.ScreenUtils;
import blcs.lwb.lwbtool.base.BasePresenter;
import blcs.lwb.utils.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class ScreenUtilsFragment extends BaseFragment {
    @BindView(R.id.btn_getScreenWidth)
    Button btnGetScreenWidth;
    @BindView(R.id.btn_getScreenHeight)
    Button btnGetScreenHeight;
    @BindView(R.id.btn_getDensity)
    Button btnGetDensity;
    @BindView(R.id.btn_getScaledDensity)
    Button btnGetScaledDensity;
    @BindView(R.id.btn_getStatusHeight)
    Button btnGetStatusHeight;
    @BindView(R.id.btn_getSnapShotWithStatusBar)
    Button btnGetSnapShotWithStatusBar;
    @BindView(R.id.btn_getSnapShotWithoutStatusBar)
    Button btnGetSnapShotWithoutStatusBar;
    @BindView(R.id.btn_getScreenSize)
    Button btnGetScreenSize;
    @BindView(R.id.img_getSnapShotWithStatusBar)
    ImageView imgGetSnapShotWithStatusBar;
    @BindView(R.id.img_getSnapShotWithoutStatusBar)
    ImageView imgGetSnapShotWithoutStatusBar;


    @Override
    public void setMiddleTitle(Toolbar title) {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected BasePresenter bindPresenter() {
        return null;
    }

    @Override
    protected int bindLayout() {
        return R.layout.fragment_screen;
    }

    @Override
    public void popBackListener(int returnCode, Bundle bundle) {

    }

    @OnClick({R.id.btn_getScreenWidth, R.id.btn_getScreenHeight, R.id.btn_getDensity, R.id.btn_getScaledDensity, R.id.btn_getStatusHeight, R.id.btn_getSnapShotWithStatusBar, R.id.btn_getSnapShotWithoutStatusBar, R.id.btn_getScreenSize})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_getScreenWidth:
                btnGetScreenWidth.setText(getString(R.string.getScreenWidth)+ ScreenUtils.getScreenWidth(activity)+"px");
                break;
            case R.id.btn_getScreenHeight:
                btnGetScreenHeight.setText(getString(R.string.getScreenHeight)+ ScreenUtils.getScreenHeight(activity)+"px");
                break;
            case R.id.btn_getDensity:
                btnGetDensity.setText(getString(R.string.getDensity)+ ScreenUtils.getDensity(activity));
                break;
            case R.id.btn_getScaledDensity:
                btnGetScaledDensity.setText(getString(R.string.getScaledDensity)+ ScreenUtils.getScaledDensity(activity));
                break;
            case R.id.btn_getStatusHeight:
                btnGetStatusHeight.setText(getString(R.string.getStatusHeight)+ ScreenUtils.getStatusHeight(activity));
                break;
            case R.id.btn_getSnapShotWithStatusBar:
                imgGetSnapShotWithStatusBar.setImageBitmap(ScreenUtils.getSnapShotWithStatusBar(activity));
                break;
            case R.id.btn_getSnapShotWithoutStatusBar:
                imgGetSnapShotWithoutStatusBar.setImageBitmap(ScreenUtils.getSnapShotWithoutStatusBar(activity));
                break;
            case R.id.btn_getScreenSize:
                btnGetScreenSize.setText(getString(R.string.getScreenSize)+ ScreenUtils.getScreenSize(activity));
                break;
        }
    }
}