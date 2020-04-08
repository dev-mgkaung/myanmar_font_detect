package mk.zawuni.zawgyiuni_detect.mmfont.components;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;

import mk.zawuni.zawgyiuni_detect.mmfont.MMFontUtils;


public class MMButton extends AppCompatButton {

    public MMButton(Context context) {
        super(context);
    }

    public MMButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MMButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (!isInEditMode())
            MMFontUtils.setMMFont(this);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (!MMFontUtils.isSupportUnicode()) {
            super.setText(MMFontUtils.mmText(text, MMFontUtils.TEXT_UNICODE, true, true), type);
        } else {
            super.setText(text, type);
        }
    }
}
