package com.aion8.treeports.persentation.splash

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aion8.treeports.R
import com.aion8.treeports.navigation.splash.Onboarding
import com.aion8.treeports.ui.theme.ThemeActiveColor
import com.aion8.treeports.ui.theme.ThemeBackgroundColor
import com.aion8.treeports.ui.theme.ThemeInactiveColor
import com.aion8.treeports.ui.theme.ThemeTextColor
import com.google.accompanist.pager.*

@ExperimentalPagerApi
@Composable
fun WelcomeBoardingScreen(
    onFinishButtonClick : () -> Unit
) {
    val pages = listOf(
        Onboarding.FirstPage,
        Onboarding.SecondPage,
        Onboarding.LastPage
    )

    val pagerState = rememberPagerState()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.ThemeBackgroundColor)
    ) {

        HorizontalPager(
           modifier = Modifier.weight(10f),
           count = pages.size,
           state = pagerState,
           verticalAlignment = Alignment.Top
        ) { pageIndex ->
           PagerScreen(onboardingPage = pages[pageIndex])
        }

        FinishButton(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally),
            pagerState = pagerState,
            onClick = onFinishButtonClick
        )

        HorizontalPagerIndicator(
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterHorizontally),
            pagerState = pagerState,
            activeColor = MaterialTheme.colors.ThemeActiveColor,
            inactiveColor = MaterialTheme.colors.ThemeInactiveColor,
            indicatorWidth = 12.dp,
            spacing = 8.dp
        )


    }

}


@Composable
fun PagerScreen( onboardingPage: Onboarding){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight(0.5f)
                .fillMaxWidth(0.7f),
            painter = painterResource(id = onboardingPage.image),
            contentDescription ="Onboarding image"
        )

        Text(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 40.dp)
                .padding(top = 10.dp),
            text = stringResource(id = onboardingPage.description),
            color = MaterialTheme.colors.ThemeTextColor,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )




    }
}



@ExperimentalPagerApi
@Composable
fun FinishButton(
    modifier : Modifier,
    pagerState: PagerState,
    onClick: () -> Unit
){
    Row (
        modifier = modifier.padding(horizontal = 40.dp),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center
    ){
        AnimatedVisibility(
            modifier = Modifier.fillMaxWidth(),
            visible = pagerState.currentPage == 2
        ) {
            Button(
                onClick = onClick,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = stringResource(id = R.string.start)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstPageOnboardingScreenPreview(){
    Column(modifier= Modifier.fillMaxSize()) {
        PagerScreen(onboardingPage = Onboarding.FirstPage)
    }
}


@Preview(showBackground = true)
@Composable
fun SecondPageOnboardingScreenPreview(){
    Column(modifier= Modifier.fillMaxSize()) {
        PagerScreen(onboardingPage = Onboarding.SecondPage)
    }
}

@Preview(showBackground = true)
@Composable
fun LastPageOnboardingScreenPreview(){
    Column(modifier= Modifier.fillMaxSize()) {
        PagerScreen(onboardingPage = Onboarding.LastPage)
    }
}