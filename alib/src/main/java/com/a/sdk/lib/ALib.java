package com.a.sdk.lib;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class ALib {
    public ALib(){

    }
    public void showASDKAlert(Context context){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
        alertDialogBuilder.setMessage("Authentic SDK Alert is Showing");
        alertDialogBuilder.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
