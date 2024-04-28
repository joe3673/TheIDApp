package com.Techmotion.appserver.service;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryAgent;
import javax.bluetooth.LocalDevice;

public class BluetoothService {

    public void scanForDevices() {

        try {
            LocalDevice localDevice = LocalDevice.getLocalDevice();
            DiscoveryAgent agent = localDevice.getDiscoveryAgent();
        } catch (BluetoothStateException e) {
            throw new RuntimeException(e);
        }
    }
}
