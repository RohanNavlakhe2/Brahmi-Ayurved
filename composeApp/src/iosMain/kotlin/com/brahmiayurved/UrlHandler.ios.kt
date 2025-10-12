package com.brahmiayurved

import platform.Foundation.NSURL
import platform.UIKit.UIApplication

actual fun openUrl(url: String) {
    val nsUrl = NSURL(string = url)
    UIApplication.sharedApplication.openURL(nsUrl)
}

actual fun openDialer(phoneNumber: String) {
    val telUrl = "tel:$phoneNumber"
    val nsUrl = NSURL(string = telUrl)
    UIApplication.sharedApplication.openURL(nsUrl)
}

actual fun openEmail(emailAddress: String) {
    val mailtoUrl = "mailto:$emailAddress"
    val nsUrl = NSURL(string = mailtoUrl)
    UIApplication.sharedApplication.openURL(nsUrl)
}
