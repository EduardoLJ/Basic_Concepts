package com.EddLJ.admin_tareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.EddLJ.admin_tareas.ui.theme.Admin_TareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Admin_TareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    jetpackComposeTutorial(getString(R.string.jetpack_compose_title),
//                        getString(R.string.jetpack_compose_description),
//                        getString(R.string.tutorial_description))
//                    cuadranteCompose(getString(R.string.cuadrante_compose_text_title),getString(R.string.cuadrante_compose_text_description),
//                        getString(R.string.cuadrante_compose_image_title),getString(R.string.cuadrante_compose_image_description),
//                        getString(R.string.cuadrante_compose_row_title),getString(R.string.cuadrante_compose_row_description),
//                        getString(R.string.cuadrante_compose_column_title),getString(R.string.cuadrante_compose_column_description))
                    allTasksCompleted(getString(R.string.tasks_all_tasks_completed), getString(R.string.tasks_nice_work))
                }
            }
        }
    }
}

@Composable
fun jetpackComposeTutorial(title: String, desc: String, tutorial: String) {
    val header = painterResource(id = R.drawable.bg_compose_background)
    Column{
        Image(
            painter = header, contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.Start)
        )
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = desc,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = tutorial,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun cuadranteCompose(textTitle: String, textDesc: String, imageTitle: String, imageDesc: String, rowTitle: String, rowDesc: String, columnTitle: String, columnDesc: String) {
    Column{
        Row{
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.5f)
                    .background(color = Color(0, 255, 0))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = textTitle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(
                        text = textDesc,
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.5f)
                    .background(color = Color(255, 255, 0))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = imageTitle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(
                        text = imageDesc,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
        Row{
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(1f)
                    .background(color = Color(0, 255, 128))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = rowTitle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(
                        text = rowDesc,
                        textAlign = TextAlign.Justify
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(1f)
                    .background(color = Color(192, 192, 192))
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = columnTitle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 16.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(
                        text = columnDesc,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

@Composable
fun allTasksCompleted(tasks: String, medal: String) {
    val checkB = painterResource(id = R.drawable.ic_task_completed)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = checkB,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = tasks,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
            )
            Text(
                text = medal,
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Admin_TareasTheme {
//        jetpackComposeTutorial("Titulo","Descrpcion","Tutorial")
//        cuadranteCompose("Text compose", "Text description", "Image compose", "Image description",
//            "Row compose", "Row description", "Column compose", "Column description")
//        allTasksCompleted("Done!","Nice!")
    }
}