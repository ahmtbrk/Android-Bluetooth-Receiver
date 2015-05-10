package com.ahmtbrk.bluetoothreceiver;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends Activity {

	BluetoothConnectionReceiver mReceiver;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mReceiver = new BluetoothConnectionReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_STARTED);
		filter.addAction(BluetoothAdapter.ACTION_DISCOVERY_FINISHED);
		filter.addAction(BluetoothAdapter.ACTION_STATE_CHANGED);
		filter.addAction(BluetoothDevice.ACTION_ACL_CONNECTED);
		filter.addAction(BluetoothDevice.ACTION_ACL_DISCONNECTED);
		registerReceiver(mReceiver, filter);
	}

	class BluetoothConnectionReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {
			switch (intent.getAction()) {
			case BluetoothAdapter.ACTION_DISCOVERY_STARTED:
				// Bluetooth starting to search any device
				break;
			case BluetoothAdapter.ACTION_DISCOVERY_FINISHED:
				// Bluetooth finishing to search any device
				break;
			case BluetoothAdapter.ACTION_STATE_CHANGED:
				// Bluetooth when opening and closing
				break;
			case BluetoothDevice.ACTION_ACL_CONNECTED:
				// Bluetooth when connected any device
				break;
			case BluetoothDevice.ACTION_ACL_DISCONNECTED:
				// Bluetooth when disconnected from paired device
				break;
			}

		}

	}
}
