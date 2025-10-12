package com.brahmiayurved.myiconpack

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush.Companion.radialGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.Unit

public val MyIconPack.IcInstagram: ImageVector
    get() {
        if (_icInstagram != null) {
            return _icInstagram!!
        }
        _icInstagram = Builder(name = "IcInstagram", defaultWidth = 800.0.dp, defaultHeight =
                800.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = radialGradient(0.0f to Color(0xFFB13589), 0.793f to Color(0xFFC62F94), 1.0f
                    to Color(0xFF8A3AC8), center = Offset(12.0f,23.0f), radius = 25.52f), stroke =
                    null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                lineTo(24.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 30.0f, 8.0f)
                lineTo(30.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 30.0f)
                lineTo(8.0f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 24.0f)
                lineTo(2.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.0f)
                close()
            }
            path(fill = radialGradient(0.0f to Color(0xFFE0E8B7), 0.445f to Color(0xFFFB8A2E),
                    0.715f to Color(0xFFE2425C), 1.0f to Color(0x00E2425C), center =
                    Offset(11.0f,31.0f), radius = 22.594f), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                lineTo(24.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 30.0f, 8.0f)
                lineTo(30.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 30.0f)
                lineTo(8.0f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 24.0f)
                lineTo(2.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.0f)
                close()
            }
            path(fill = radialGradient(0.157f to Color(0xFF406ADC), 0.468f to Color(0xFF6A45BE),
                    1.0f to Color(0x006A45BE), center = Offset(0.5f,3.0f), radius = 38.891f), stroke
                    = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                lineTo(24.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 30.0f, 8.0f)
                lineTo(30.0f, 24.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 24.0f, 30.0f)
                lineTo(8.0f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 2.0f, 24.0f)
                lineTo(2.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 8.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 10.5f)
                curveTo(23.0f, 11.328f, 22.328f, 12.0f, 21.5f, 12.0f)
                curveTo(20.672f, 12.0f, 20.0f, 11.328f, 20.0f, 10.5f)
                curveTo(20.0f, 9.672f, 20.672f, 9.0f, 21.5f, 9.0f)
                curveTo(22.328f, 9.0f, 23.0f, 9.672f, 23.0f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 21.0f)
                curveTo(18.761f, 21.0f, 21.0f, 18.761f, 21.0f, 16.0f)
                curveTo(21.0f, 13.239f, 18.761f, 11.0f, 16.0f, 11.0f)
                curveTo(13.239f, 11.0f, 11.0f, 13.239f, 11.0f, 16.0f)
                curveTo(11.0f, 18.761f, 13.239f, 21.0f, 16.0f, 21.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.657f, 19.0f, 19.0f, 17.657f, 19.0f, 16.0f)
                curveTo(19.0f, 14.343f, 17.657f, 13.0f, 16.0f, 13.0f)
                curveTo(14.343f, 13.0f, 13.0f, 14.343f, 13.0f, 16.0f)
                curveTo(13.0f, 17.657f, 14.343f, 19.0f, 16.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 15.6f)
                curveTo(6.0f, 12.24f, 6.0f, 10.559f, 6.654f, 9.276f)
                curveTo(7.229f, 8.147f, 8.147f, 7.229f, 9.276f, 6.654f)
                curveTo(10.559f, 6.0f, 12.24f, 6.0f, 15.6f, 6.0f)
                horizontalLineTo(16.4f)
                curveTo(19.76f, 6.0f, 21.441f, 6.0f, 22.724f, 6.654f)
                curveTo(23.853f, 7.229f, 24.771f, 8.147f, 25.346f, 9.276f)
                curveTo(26.0f, 10.559f, 26.0f, 12.24f, 26.0f, 15.6f)
                verticalLineTo(16.4f)
                curveTo(26.0f, 19.76f, 26.0f, 21.441f, 25.346f, 22.724f)
                curveTo(24.771f, 23.853f, 23.853f, 24.771f, 22.724f, 25.346f)
                curveTo(21.441f, 26.0f, 19.76f, 26.0f, 16.4f, 26.0f)
                horizontalLineTo(15.6f)
                curveTo(12.24f, 26.0f, 10.559f, 26.0f, 9.276f, 25.346f)
                curveTo(8.147f, 24.771f, 7.229f, 23.853f, 6.654f, 22.724f)
                curveTo(6.0f, 21.441f, 6.0f, 19.76f, 6.0f, 16.4f)
                verticalLineTo(15.6f)
                close()
                moveTo(15.6f, 8.0f)
                horizontalLineTo(16.4f)
                curveTo(18.113f, 8.0f, 19.278f, 8.002f, 20.178f, 8.075f)
                curveTo(21.055f, 8.147f, 21.503f, 8.277f, 21.816f, 8.436f)
                curveTo(22.569f, 8.819f, 23.181f, 9.431f, 23.564f, 10.184f)
                curveTo(23.723f, 10.497f, 23.853f, 10.945f, 23.925f, 11.822f)
                curveTo(23.998f, 12.722f, 24.0f, 13.887f, 24.0f, 15.6f)
                verticalLineTo(16.4f)
                curveTo(24.0f, 18.113f, 23.998f, 19.278f, 23.925f, 20.178f)
                curveTo(23.853f, 21.055f, 23.723f, 21.503f, 23.564f, 21.816f)
                curveTo(23.181f, 22.569f, 22.569f, 23.181f, 21.816f, 23.564f)
                curveTo(21.503f, 23.723f, 21.055f, 23.853f, 20.178f, 23.925f)
                curveTo(19.278f, 23.998f, 18.113f, 24.0f, 16.4f, 24.0f)
                horizontalLineTo(15.6f)
                curveTo(13.887f, 24.0f, 12.722f, 23.998f, 11.822f, 23.925f)
                curveTo(10.945f, 23.853f, 10.497f, 23.723f, 10.184f, 23.564f)
                curveTo(9.431f, 23.181f, 8.819f, 22.569f, 8.436f, 21.816f)
                curveTo(8.277f, 21.503f, 8.147f, 21.055f, 8.075f, 20.178f)
                curveTo(8.002f, 19.278f, 8.0f, 18.113f, 8.0f, 16.4f)
                verticalLineTo(15.6f)
                curveTo(8.0f, 13.887f, 8.002f, 12.722f, 8.075f, 11.822f)
                curveTo(8.147f, 10.945f, 8.277f, 10.497f, 8.436f, 10.184f)
                curveTo(8.819f, 9.431f, 9.431f, 8.819f, 10.184f, 8.436f)
                curveTo(10.497f, 8.277f, 10.945f, 8.147f, 11.822f, 8.075f)
                curveTo(12.722f, 8.002f, 13.887f, 8.0f, 15.6f, 8.0f)
                close()
            }
        }
        .build()
        return _icInstagram!!
    }

private var _icInstagram: ImageVector? = null

@Preview
@Composable
private fun Preview(): Unit {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = MyIconPack.IcInstagram, contentDescription = "")
    }
}
