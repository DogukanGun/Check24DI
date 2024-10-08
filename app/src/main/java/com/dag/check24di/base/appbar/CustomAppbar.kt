package com.dag.check24di.base.appbar

import androidx.compose.foundation.layout.*
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dag.check24di.R
import com.dag.check24di.base.Check24SurfacePreview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomAppbar() {
    TopAppBar(
        title = {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Check24 - Code Challenge",
                    style = MaterialTheme.typography.headlineLarge
                )
            }
        },
        navigationIcon = { },
        actions = {}
    )
}

@Composable
@Preview
fun CustomAppbarPreview() {
    Check24SurfacePreview {
        CustomAppbar()
    }
}