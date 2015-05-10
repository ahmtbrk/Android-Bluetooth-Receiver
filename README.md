# Android-Bluetooth-Receiver
Android Bluetooth sensor state broadcastreceiver
Android Bluetooth sensörünün durumunu dinleyen broadcastreceiver

## Which there are actions in this receiver? - English
* ACTION_DISCOVERY_STARTED -> Bluetooth sensor starting to search any device
* ACTION_DISCOVERY_FINISHED -> Bluetooth sensor finishing to search any device
* ACTION_STATE_CHANGED -> Bluetooth sensor when opening and closing
* ACTION_ACL_CONNECTED -> Bluetooth sensor when connected any device
* ACTION_ACL_DISCONNECTED -> Bluetooth sensor when disconnected from paired device

## Receiver içerisinde hangi aksiyonlar mevcut? - Türkçe
* ACTION_DISCOVERY_STARTED -> Herhangi bir cihaz aramaya başladığında
* ACTION_DISCOVERY_FINISHED -> Cihaz arama bittiğinde
* ACTION_STATE_CHANGED -> Bluetooth açılıp kapandığında
* ACTION_ACL_CONNECTED -> Herhangi bir cihaza bağlanıldığında
* ACTION_ACL_DISCONNECTED -> Eşleşilen cihazdan bağlantı koptuğunda
