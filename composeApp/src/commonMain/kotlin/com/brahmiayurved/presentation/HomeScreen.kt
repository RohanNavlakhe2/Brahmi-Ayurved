package com.brahmiayurved.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.brahmiayurved.COLOR_PRIMARY
import com.brahmiayurved.openUrl
import com.brahmiayurved.widget.Carousel

data class Service(
    val id: Int,
    val name: String,
    val iconSymbol: String
)

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Carousel()
        Spacer(modifier = Modifier.height(24.dp))
        ServicesSection()
        Spacer(modifier = Modifier.height(24.dp))
        BookAppointmentButton()
    }
}

@Composable
fun ServicesSection() {
    // Sample services data with Unicode symbols
    val services = listOf(
        Service(1, "Consultation", "👨‍⚕️"),
        Service(2, "Panchakarma", "🧘‍♀️"),
        Service(3, "Herbal Medicine", "🌿"),
        Service(4, "Wellness", "✨"),
        Service(5, "Diet Planning", "🥗"),
        Service(6, "Yoga Therapy", "🧘"),
        Service(7, "Massage", "💆‍♀️"),
        Service(8, "Treatment", "🏥")
    )
    
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        // Section Title
        Text(
            text = "Services",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        
        // Horizontal scrollable list of services
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            contentPadding = PaddingValues(end = 16.dp)
        ) {
            items(services) { service ->
                ServiceCard(service)
            }
        }
    }
}

@Composable
fun ServiceCard(service: Service) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(120.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            // Icon container with circular background
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = COLOR_PRIMARY.copy(alpha = 0.15f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = service.iconSymbol,
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Service name
            Text(
                text = service.name,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                textAlign = TextAlign.Center,
                maxLines = 2,
                lineHeight = 14.sp
            )
        }
    }
}

@Composable
fun BookAppointmentButton() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                openUrl("https://brahmiayurved.setmore.com/")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = COLOR_PRIMARY,
                contentColor = Color.White
            ),
            shape = RoundedCornerShape(12.dp)
        ) {
            Text(
                text = "Book Appointment",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
