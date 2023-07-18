package com.fegssp.tasklist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fegssp.tasklist.ui.theme.TaskListTheme
import com.fegssp.tasklist.view.AddTask
import com.fegssp.tasklist.view.TaskList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskListTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "listaTarefas" ){
                    composable(
                        route = "listaTarefas"
                    ){
                        TaskList(navController)
                    }
                    composable(
                        route = "adicionarTarefa"
                    ){
                        AddTask(navController)
                    }
                }
            }
        }
    }
}
