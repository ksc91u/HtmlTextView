package taiwan.ksc91u.htmltextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.text.Html;
import android.util.AttributeSet;
import android.util.Log;


public class HtmlTextView extends android.support.v7.widget.AppCompatTextView {
  public HtmlTextView(Context context) {
    super(context);
  }

  public HtmlTextView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
    setTextFromAttrs(attrs);
  }

  public HtmlTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
    setTextFromAttrs(attrs);
  }

  private void setTextFromAttrs(AttributeSet attrs) {
    TypedArray ta = getContext().obtainStyledAttributes(attrs, R.styleable.HtmlTextView);
    String theString = ta.getString(R.styleable.HtmlTextView_htmlText);
    setText(Html.fromHtml(theString));
    ta.recycle();
  }

}
