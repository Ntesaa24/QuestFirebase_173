package com.example.pertemuan14.view.controllNavigasi

import android.R.attr.type
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.pertemuan14.view.DetailSiswaScreen
import com.example.pertemuan14.view.EditSiswaScreen
import com.example.pertemuan14.view.EntrySiswaScreen
import com.example.pertemuan14.view.HomeScreen
import com.example.pertemuan14.view.route.DestinasiDetail
import com.example.pertemuan14.view.route.DestinasiEdit
import com.example.pertemuan14.view.route.DestinasiEntry
import com.example.pertemuan14.view.route.DestinasiHome

@Composable
fun DataSiswaApp(navController: NavHostController = rememberNavController(), modifier: Modifier){
	HostNavigasi(navController = navController)
}

