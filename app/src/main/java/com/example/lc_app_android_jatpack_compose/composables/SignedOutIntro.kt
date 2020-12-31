package com.example.lc_app_android_jatpack_compose.composables

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lc_app_android_jatpack_compose.R
import com.example.lc_app_android_jatpack_compose.ui.givingButton
import com.example.lc_app_android_jatpack_compose.ui.grayText

@Preview(showBackground = true)
@Composable
fun SignedOutIntro(){
    ScrollableColumn() {
        Image(
                bitmap = imageResource(id = R.drawable.giving_intro1),
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))
        Text(
                text = "Give safely\nand securely.",
                color = grayText,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterHorizontally)
                        .padding(start = 36.dp, top = 0.dp, end = 36.dp, bottom = 0.dp),
                textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(top = 8.dp))
        Text(
                text = "Discover why app giving is the easiest and best way to give to Life.Church.",
                color = grayText,
                modifier = Modifier.padding(start = 36.dp, top = 0.dp, end = 36.dp, bottom = 0.dp),
                textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.padding(top = 45.dp))
        Button(
                onClick = {},
                shape = CircleShape,// RoundedCornerShape(50)
                colors = ButtonConstants.defaultButtonColors(backgroundColor = givingButton),
                modifier = Modifier
                        .padding(start = 32.dp, top = 0.dp, end = 32.dp, bottom = 0.dp)
                        .size(width = 223.dp, height = 48.dp)
                        .height(48.dp)
                        .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Start Giving", color = Color.White, fontSize = 16.sp)
        }
    }
}