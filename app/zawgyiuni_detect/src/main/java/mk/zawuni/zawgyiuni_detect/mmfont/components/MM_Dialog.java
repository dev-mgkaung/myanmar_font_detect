package mk.zawuni.zawgyiuni_detect.mmfont.components;

import android.app.AlertDialog;
import android.content.Context;
import android.text.Html;

import mk.zawuni.zawgyiuni_detect.mmfont.MMFontUtils;

public class MM_Dialog extends AlertDialog {
    public MM_Dialog(Context context) {
        super(context);
    }

    public MM_Dialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    public void setMessage(CharSequence message) {
        if (!MMFontUtils.isSupportUnicode()) {
            super.setMessage(Html.fromHtml(MMFontUtils.uni2zg(message.toString())));
        } else {
            super.setMessage(Html.fromHtml(message.toString()));
        }
    }

}
