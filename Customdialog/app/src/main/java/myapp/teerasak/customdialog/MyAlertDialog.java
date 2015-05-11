package myapp.teerasak.customdialog;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import myapp.teerasak.customdialog.MainActivity;

/**
 * Created by Teerasak S. on 3/31/2015.
 */
public class MyAlertDialog{
    private Context context;

    public MyAlertDialog(Context context) {
        this.context = context;
    }

    public void show() {
        final Dialog dialog = new Dialog(context);
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.layout_dialog);
        dialog.setCancelable(false);

        Button buttonOK = (Button) dialog.findViewById(R.id.button_ok);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }


}   //Main Class
