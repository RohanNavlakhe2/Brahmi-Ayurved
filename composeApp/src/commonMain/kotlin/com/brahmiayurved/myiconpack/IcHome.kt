package com.brahmiayurved.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

public val MyIconPack.IcHome: ImageVector
    get() {
        if (_icHome != null) {
            return _icHome!!
        }
        _icHome = Builder(name = "IcHome", defaultWidth = 800.0.dp, defaultHeight = 800.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 16.0f)
                curveTo(9.85f, 16.63f, 10.885f, 17.0f, 12.0f, 17.0f)
                curveTo(13.115f, 17.0f, 14.15f, 16.63f, 15.0f, 16.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF1C274C)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.204f)
                verticalLineTo(13.725f)
                curveTo(22.0f, 17.626f, 22.0f, 19.576f, 20.828f, 20.788f)
                curveTo(19.657f, 22.0f, 17.771f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.229f, 22.0f, 4.343f, 22.0f, 3.172f, 20.788f)
                curveTo(2.0f, 19.576f, 2.0f, 17.626f, 2.0f, 13.725f)
                verticalLineTo(12.204f)
                curveTo(2.0f, 9.915f, 2.0f, 8.771f, 2.519f, 7.823f)
                curveTo(3.038f, 6.874f, 3.987f, 6.286f, 5.884f, 5.108f)
                lineTo(7.884f, 3.867f)
                curveTo(9.889f, 2.622f, 10.892f, 2.0f, 12.0f, 2.0f)
                curveTo(13.108f, 2.0f, 14.111f, 2.622f, 16.116f, 3.867f)
                lineTo(18.116f, 5.108f)
                curveTo(20.013f, 6.286f, 20.962f, 6.874f, 21.481f, 7.823f)
            }
        }
        .build()
        return _icHome!!
    }

private var _icHome: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcHome, contentDescription = "")
    }
}
