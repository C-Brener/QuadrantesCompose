package com.example.quadrantescompose

import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.core.app.ActivityScenario
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowLog


@RunWith(RobolectricTestRunner::class)
class MainActivityTest{

    @get:Rule
    val composeRule = createComposeRule()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out // Redirect Logcat to console
    }

    @Test
    fun `Ensure the component init informations in the screen`(){
        ActivityScenario.launch(MainActivity::class.java).use{ activityScenario ->

            activityScenario.onActivity { activity ->


                composeRule.onNodeWithTag("First Column").assertIsDisplayed()

            }

        }
    }



}