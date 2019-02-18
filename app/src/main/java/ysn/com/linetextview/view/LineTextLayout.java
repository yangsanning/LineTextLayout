package ysn.com.linetextview.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @Author yangsanning
 * @ClassName LineTextView
 * @Description 使首个TextView一行显示的View
 * @Date 2019/2/18
 * @History 2019/2/18 author: description:
 */
public class LineTextLayout extends LinearLayout {

    public LineTextLayout(Context context) {
        this(context, null);
    }

    public LineTextLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LineTextLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setTextView(CharSequence text) {
        if (getOrientation() == LinearLayout.HORIZONTAL) {
            TextView textView = null;
            int maxWidth = getWidth();
            for (int i = 0; i < getChildCount(); i++) {
                View child = getChildAt(i);
                if (textView == null && child instanceof TextView) {
                    textView = (TextView) child;
                } else {
                    ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
                    maxWidth = maxWidth - child.getWidth() - params.leftMargin - params.rightMargin;
                }
            }
            if (textView != null) {
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setMaxWidth(maxWidth);
                textView.setText(text);
            }
        }
    }
}
