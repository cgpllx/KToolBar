package com.example.ktoolbar;

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.TextView;

public class KToolBar extends Toolbar {

	private TextView mTitleTextView;
	private int mTitleTextColor;
	private float mTitleSize = 20f;
	private int mUnit = TypedValue.COMPLEX_UNIT_SP;
	private CharSequence mTitleText;
	private CharSequence mSubtitleText;

	public KToolBar(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		initTitleView();
	}

	public KToolBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		initTitleView();
	}

	public KToolBar(Context context) {
		super(context);
		initTitleView();
	}

	@Override
	protected LayoutParams generateDefaultLayoutParams() {
		return new Toolbar.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, Gravity.CENTER);
	}

	private void initTitleView() {
		mTitleTextView = new TextView(getContext());
		Toolbar.LayoutParams lp = new Toolbar.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, Gravity.CENTER);
		mTitleTextView.setTextSize(mUnit, mTitleSize);
		if (!TextUtils.isEmpty(mTitleText)) {
			mTitleTextView.setText(mTitleText);
		}
		if (this.mTitleTextColor != 0) {
			this.mTitleTextView.setTextColor(this.mTitleTextColor);
		}
		addView(mTitleTextView, lp);
	}

	public void setTitleSize(float size) {
		setTitleSize(TypedValue.COMPLEX_UNIT_SP, size);
	}

	public void setTitleSize(int unit, float size) {
		this.mUnit = unit;
		this.mTitleSize = size;
		if (mTitleTextView != null) {
			mTitleTextView.setTextSize(mUnit, mTitleSize);
		}
	}

	@Override
	public CharSequence getTitle() {
		return mTitleText;
	}

	@Override
	public CharSequence getSubtitle() {
		return mSubtitleText;
	}

	@Override
	public void setSubtitle(CharSequence subtitle) {
		this.mSubtitleText = subtitle;
	}

	@Override
	public void setTitle(CharSequence title) {
		this.mTitleText = title;
		if (mTitleTextView != null) {
			mTitleTextView.setText(title);
		}
	}

	@Override
	public void setTitleTextColor(int color) {
		super.setTitleTextColor(color);
		this.mTitleTextColor = color;
		if (this.mTitleTextView != null) {
			this.mTitleTextView.setTextColor(color);
		}
	}

}
