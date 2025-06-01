package com.example.musicappui.ui.theme

import android.graphics.Paint
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicappui.R
import com.example.musicappui.Screen
import java.nio.file.WatchEvent

@Composable
fun Subscription(){

    Column(modifier = Modifier.height(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Manage Subscription")
        Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
            Column(modifier = Modifier.padding(8.dp)) {
                Column() {
                    Text("Musical")
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween ) {
                        Text(text = "Free Tier")
                        TextButton(onClick = {}) {
                            Row {
                                Text(text = "See All Plans")
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                                    contentDescription = "See All Plans"
                                )
                            }
                        }
                    }
                }
                Divider(thickness = 1.dp, modifier = Modifier.padding(horizontal = 8.dp))

                Row(modifier = Modifier.padding(vertical = 16.dp)){
                    Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Get a Plan")
                    Text(text = "Get a Plan")
                }
            }

        }

    }
//    Text(text = "Manage Subscription", modifier = Modifier.padding(bottom = 8.dp))
//
//    Column(
//        modifier = Modifier.fillMaxSize().padding(16.dp)
//
//    ) {
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceBetween,
//
//        ) {
//            Column {
//                Text("Musical")
//                Text("Free trial")
//            }
//            Row(verticalAlignment = Alignment.BottomEnd as Alignment.Vertical,
//                horizontalArrangement = Arrangement.End) {
//                Text("See All Plans")
//                IconButton(onClick = {}) {
//                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
//                        contentDescription = "See all plans")
//                }
//            }
//
//
//
//        }
//        Divider()
//
//        Row(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Icon(painter = painterResource(id = R.drawable.baseline_account_box_24),
//                modifier = Modifier.padding(end = 8.dp),
//                contentDescription = "get a plan")
//            Text(text = "Get a plan")
//        }
//        Divider()
//    }
}