package com.brahmiayurved.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.brahmiayurved.COLOR_PRIMARY
import com.brahmiayurved.ORANGE
import com.brahmiayurved.myiconpack.IcContact
import com.brahmiayurved.myiconpack.IcGmail
import com.brahmiayurved.myiconpack.IcHome
import com.brahmiayurved.myiconpack.IcInstagram
import com.brahmiayurved.myiconpack.IcLibrary
import com.brahmiayurved.myiconpack.IcLinkedin
import com.brahmiayurved.myiconpack.IcPhone
import com.brahmiayurved.myiconpack.MyIconPack
import com.brahmiayurved.openDialer
import com.brahmiayurved.openEmail
import com.brahmiayurved.openUrl

@Composable
fun ContactScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(Color(0xFFF8F9FA))
    ) {
        // Header Section
        HeaderSection()

        // Quick Actions
        //QuickActionsSection()

        // Clinic Information
        ClinicInfoSection()

        // About Section
        AboutSection()

        // Contact Information
        ContactInfoSection()

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Doctor Image Placeholder
        Box(
            modifier = Modifier
                .size(80.dp)
                .clip(CircleShape)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(COLOR_PRIMARY, Color(0xFF3D8B36))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "V",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Brahmi Ayurved",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D3748)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Dr. Vaibhav Wani",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D3748)
        )

        Text(
            text = "Oncologist, (M.D Ayurved)",
            fontSize = 16.sp,
            color = Color(0xFF718096)
        )



        Spacer(modifier = Modifier.height(8.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = MyIconPack.IcHome,
                contentDescription = "Location",
                tint = COLOR_PRIMARY,
                modifier = Modifier.size(16.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Chikhali, Pune",
                fontSize = 14.sp,
                color = Color(0xFF4A5568)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "9 Years Experience",
            fontSize = 14.sp,
            color = COLOR_PRIMARY,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun QuickActionsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Text(
            text = "Book an Appointment",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF2D3748),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            OutlinedButton(
                onClick = { /* Handle clinic visit booking */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = COLOR_PRIMARY
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = MyIconPack.IcHome,
                        contentDescription = "In Clinic",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("In-Clinic Visit", fontSize = 12.sp)
                }
            }

            Button(
                onClick = { /* Handle teleconsultation booking */ },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(
                    containerColor = COLOR_PRIMARY
                ),
                shape = RoundedCornerShape(8.dp)
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        imageVector = MyIconPack.IcContact,
                        contentDescription = "Teleconsultation",
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text("Teleconsultation", fontSize = 12.sp)
                }
            }
        }
    }
}

@Composable
fun ContactInfoSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Contact Information",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            ContactInfoRow(
                icon = MyIconPack.IcPhone,
                title = "Phone",
                subtitle = "+91 98765 43210",
                onClick = { openDialer("+91 98765 43210") }
            )

            Divider(modifier = Modifier.padding(vertical = 12.dp))

            ContactInfoRow(
                icon = MyIconPack.IcGmail,
                title = "Email",
                subtitle = "info@brahmiayurved.com",
                onClick = { openEmail("info@brahmiayurved.com") }
            )

            Divider(modifier = Modifier.padding(vertical = 12.dp))

            ContactInfoRow(
                icon = MyIconPack.IcInstagram,
                title = "Instagram",
                subtitle = "@brahmiayurvedpune",
                onClick = { openUrl("https://www.instagram.com/brahmiayurvedpune?igsh=MTNuY2oyd3dkYjFhaA==") }
            )

            Divider(modifier = Modifier.padding(vertical = 12.dp))

            ContactInfoRow(
                icon = MyIconPack.IcLinkedin,
                title = "LinkedIn",
                subtitle = "Dr. Vaibhav Wani",
                onClick = { openUrl("https://www.linkedin.com/in/dr-vaibhav-wani-0b2362234?utm_source=share&utm_campaign=share_via&utm_co") }
            )
        }
    }
}

@Composable
fun ContactInfoRow(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = title,
            modifier = Modifier.size(24.dp),
            tint = Color.Unspecified
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text(
                text = title,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF2D3748)
            )
            Text(
                text = subtitle,
                fontSize = 12.sp,
                color = Color(0xFF718096)
            )
        }
    }
}

@Composable
fun ClinicInfoSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Clinic Information",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            ClinicInfoItem(
                title = "Brahmi Ayurved",
                subtitle = "Chikhali, Pune",
                address = "Pl No.12/15, 16, Aranyeshwar Rd, near Surabhi Mangal Karyalay, Taware Colony, Digvijay Society, Pune, Maharashtra 411009, pune, maharashtra, India, 411009"
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Clinic Timing Section
            Text(
                text = "Clinic Timings",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            ClinicTimingItem(
                days = "Mon - Sat",
                morningTime = "10:00 AM - 01:00 PM",
                eveningTime = "06:00 PM - 09:00 PM"
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Available Services",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 8.dp)
            )

            ServiceChip("Consultation")
            Spacer(modifier = Modifier.height(8.dp))
            ServiceChip("Panchakarma")
            Spacer(modifier = Modifier.height(8.dp))
            ServiceChip("Therapy")
        }
    }
}

@Composable
fun ClinicInfoItem(
    title: String,
    subtitle: String,
    address: String
) {
    Column {
        Text(
            text = title,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF2D3748)
        )
        Text(
            text = subtitle,
            fontSize = 14.sp,
            color = Color(0xFF718096)
        )
        Text(
            text = address,
            fontSize = 12.sp,
            color = Color(0xFF718096)
        )
    }
}

@Composable
fun ClinicTimingItem(
    days: String,
    morningTime: String,
    eveningTime: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = MyIconPack.IcHome,
            contentDescription = "Clock",
            tint = COLOR_PRIMARY,
            modifier = Modifier.size(20.dp)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                text = days,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2D3748)
            )

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = morningTime,
                    fontSize = 12.sp,
                    color = Color(0xFF718096)
                )
                Text(
                    text = eveningTime,
                    fontSize = 12.sp,
                    color = Color(0xFF718096)
                )
            }
        }
    }
}

@Composable
fun ServiceChip(text: String) {
    Box(
        modifier = Modifier
            .background(
                color = COLOR_PRIMARY.copy(alpha = 0.1f),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Text(
            text = text,
            fontSize = 12.sp,
            color = COLOR_PRIMARY,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun DiseaseItem(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(6.dp)
                .background(
                    color = COLOR_PRIMARY,
                    shape = CircleShape
                )
        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text = text,
            fontSize = 14.sp,
            color = Color(0xFF4A5568),
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun AboutSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .padding(top = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "About Brahmi Ayurved",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 16.dp)
            )

            Text(
                text = "Ayurvedic treatment with Panchakarma for all types of diseases like Joint Pains, Skin diseases, Hair fall, Paralysis, Diabetes, BP, Obesity, PCOD, Infertility, etc. We provide authentic Ayurvedic treatments with experienced doctors and traditional healing methods.",
                fontSize = 14.sp,
                color = Color(0xFF4A5568),
                lineHeight = 20.sp,
                textAlign = TextAlign.Justify
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Specialization",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF2D3748),
                modifier = Modifier.padding(bottom = 12.dp)
            )

            Column(
                modifier = Modifier.padding(start = 8.dp)
            ) {
                DiseaseItem("Cancer")
                DiseaseItem("Diabetes")
                DiseaseItem("Kidney Disease")
                DiseaseItem("Heart Disease")
            }

        }
    }
}
