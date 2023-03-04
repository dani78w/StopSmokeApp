package com.example.stopsmokeapp

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.ArrowForwardIos
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {

    Column(
        modifier =
        androidx.compose.ui.Modifier
            .fillMaxWidth()

    ) {
        Column(modifier = androidx.compose.ui.Modifier
            .weight(0.6f)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center


        ) {
            Image(
                painter = painterResource(id = R.drawable.cigarro),
                contentDescription = "Logo",
                modifier = androidx.compose.ui.Modifier
                    .weight(0.6f),
                colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(MaterialTheme.colorScheme.primary)
            )
            Text(
                text = "STOP SMOKING",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = androidx.compose.ui.Modifier
                    .weight(0.1f)
            )
            Text(
                text = "THIS COULD BE YOUR LAST CHANCE",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary,
                modifier = androidx.compose.ui.Modifier
                    .weight(0.2f)
            )
        }
        Column(modifier = androidx.compose.ui.Modifier
            .weight(0.2f)
            .fillMaxWidth()

        ) {
            var user = remember() { mutableStateOf("") }
            var pass = remember() { mutableStateOf("") }

            OutlinedTextField(
                modifier = Modifier

                    .fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp)
                    .weight(0.4f),
                value = user.value,
                singleLine = true,
                shape = Shapes.Full,
                onValueChange = { user.value = it },
                label = { Text("Usuario") },
                trailingIcon = { Icon(Icons.Filled.AccountCircle, contentDescription = "User", modifier = Modifier.padding(end = 10.dp))}
            )
            Spacer(modifier =Modifier.weight(0.2f))
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 40.dp, end = 40.dp)
                    .weight(0.4f),
                value = pass.value,
                singleLine = true,
                isError = pass.value.length > 6,
                shape = Shapes.Full,
                onValueChange = { pass.value = it },
                visualTransformation = androidx.compose.ui.text.input.PasswordVisualTransformation(),
                label = { Text("Contraseña") },

                trailingIcon = { Icon(Icons.Filled.Lock, contentDescription = "User", modifier = Modifier.padding(end = 10.dp))}
            )

        }
        Column(modifier = androidx.compose.ui.Modifier
            .weight(0.2f)
            .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            OutlinedButton(
                onClick = { /*TODO*/ },
                shape = Shapes.Full,
                modifier = Modifier
                    .width(75.dp)
                    .height(75.dp),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)


            ) {
                Icon(Icons.Outlined.ArrowForwardIos, contentDescription = "User", modifier = Modifier.size(60.dp,30.dp))
            }
        }
    }

}