package com.example.firebolt

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical">

<TextView
android:id="@+id/balance_text_view"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Balance: 0 BTC" />

<EditText
android:id="@+id/address_edit_text"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Address" />

<EditText
android:id="@+id/amount_edit_text"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Amount (BTC)" />

<Button
android:id="@+id/send_button"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="Send" />

</LinearLayout>