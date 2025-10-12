package com.brahmiayurved.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerSnapDistance
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.brahmiayurved.COLOR_PRIMARY
import kotlinx.coroutines.delay

@Composable
fun Carousel(){
    // Dummy data for carousel
    val carouselItems = listOf(
        CarouselItem(
            id = 1,
            title = "Welcome to Brahmi Ayurved",
            description = "Discover ancient wisdom for modern wellness",
            backgroundColor = Color(0xFF6A4C93)
        ),
        CarouselItem(
            id = 2,
            title = "Natural Healing",
            description = "Experience the power of herbal remedies",
            backgroundColor = Color(0xFF1982C4)
        ),
        CarouselItem(
            id = 3,
            title = "Holistic Health",
            description = "Balance your mind, body, and spirit",
            backgroundColor = Color(0xFF8AC926)
        ),
        CarouselItem(
            id = 4,
            title = "Traditional Practices",
            description = "Time-tested Ayurvedic treatments",
            backgroundColor = Color(0xFFFF595E)
        ),
        CarouselItem(
            id = 5,
            title = "Wellness Journey",
            description = "Start your path to better health today",
            backgroundColor = Color(0xFFFFCA3A)
        )
    )

    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount = { carouselItems.size }
    )

    // Auto-scroll functionality
    LaunchedEffect(pagerState.currentPage) {
        delay(2500) // 3 seconds delay
        pagerState.scrollToPage((pagerState.currentPage + 1) % carouselItems.size)
        /*pagerState.scroll {
            scrollBy(pagerState.layoutInfo.pageSize.toFloat() + pagerState.layoutInfo.pageSpacing)
        }*/
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Horizontal Pager (Carousel)
        HorizontalPager(
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(horizontal = 16.dp),
            flingBehavior = PagerDefaults.flingBehavior(
                pagerState,
                pagerSnapDistance = PagerSnapDistance.atMost(1)
            )
        ) { page ->
            CarouselItemView(carouselItems[page])
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Page Indicators
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(carouselItems.size) { index ->
                val isSelected = pagerState.currentPage == index
                Box(
                    modifier = Modifier
                        .padding(4.dp)
                        .size(if (isSelected) 10.dp else 8.dp)
                        .background(
                            color = if (isSelected) COLOR_PRIMARY else Color.Gray,
                            shape = CircleShape
                        )
                )
            }
        }
    }
}

data class CarouselItem(
    val id: Int,
    val title: String,
    val description: String,
    val backgroundColor: Color
) {

}

@Composable
fun CarouselItemView(item: CarouselItem) {
    Card(
        modifier = Modifier
            .fillMaxSize(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(item.backgroundColor),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = item.title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = item.description,
                    fontSize = 16.sp,
                    color = Color.White.copy(alpha = 0.9f)
                )
            }
        }
    }
}