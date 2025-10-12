package com.brahmiayurved.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

public val MyIconPack.IcContact: ImageVector
    get() {
        if (_icContact != null) {
            return _icContact!!
        }
        _icContact = Builder(name = "IcContact", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
                    strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(10.0f, 10.0f)
                curveTo(7.783f, 10.0f, 5.981f, 8.206f, 5.981f, 6.0f)
                curveTo(5.981f, 3.794f, 7.783f, 2.0f, 10.0f, 2.0f)
                curveTo(12.217f, 2.0f, 14.019f, 3.794f, 14.019f, 6.0f)
                curveTo(14.019f, 8.206f, 12.217f, 10.0f, 10.0f, 10.0f)
                moveTo(13.776f, 10.673f)
                curveTo(15.37f, 9.396f, 16.3f, 7.331f, 15.958f, 5.07f)
                curveTo(15.561f, 2.447f, 13.369f, 0.348f, 10.722f, 0.042f)
                curveTo(7.07f, -0.381f, 3.971f, 2.449f, 3.971f, 6.0f)
                curveTo(3.971f, 7.89f, 4.852f, 9.574f, 6.224f, 10.673f)
                curveTo(2.852f, 11.934f, 0.39f, 14.895f, 0.005f, 18.891f)
                curveTo(-0.052f, 19.482f, 0.412f, 20.0f, 1.008f, 20.0f)
                curveTo(1.52f, 20.0f, 1.956f, 19.616f, 2.001f, 19.109f)
                curveTo(2.404f, 14.646f, 5.837f, 12.0f, 10.0f, 12.0f)
                curveTo(14.163f, 12.0f, 17.596f, 14.646f, 17.999f, 19.109f)
                curveTo(18.044f, 19.616f, 18.48f, 20.0f, 18.992f, 20.0f)
                curveTo(19.588f, 20.0f, 20.052f, 19.482f, 19.995f, 18.891f)
                curveTo(19.61f, 14.895f, 17.148f, 11.934f, 13.776f, 10.673f)
            }
        }
        .build()
        return _icContact!!
    }

private var _icContact: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcContact, contentDescription = "")
    }
}
