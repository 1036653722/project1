package io.github.subhamtyagi.lastlauncher;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
//CS304 (manually written) Issue link: https://github.com/SubhamTyagi/Last-Launcher/issues/135
public class LayoutAppSettingTest {

    @Rule
    public ActivityTestRule<LauncherActivity> mActivityTestRule = new ActivityTestRule<>(LauncherActivity.class);

    @Test
    public void launcherActivityTest() {
        ViewInteraction appTextView = onView(
                allOf(withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView.perform(scrollTo(), longClick());

        ViewInteraction textView = onView(
                allOf(withId(android.R.id.title), withText("Reset All"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView.perform(click());

        ViewInteraction appTextView2 = onView(
                allOf(withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView2.perform(scrollTo(), longClick());

        ViewInteraction textView2 = onView(
                allOf(withId(android.R.id.title), withText("Rename"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView2.perform(click());

        ViewInteraction editText = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText.perform(replaceText("Last Launcher Devq"));

        ViewInteraction editText2 = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Devq"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText2.perform(closeSoftKeyboard());

        ViewInteraction editText3 = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Devq"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText3.perform(pressImeActionButton());

        ViewInteraction appTextView3 = onView(
                allOf(withText("Last Launcher Devq"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView3.perform(scrollTo(), longClick());

        ViewInteraction textView3 = onView(
                allOf(withId(android.R.id.title), withText("Rename"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView3.perform(click());

        ViewInteraction editText4 = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Devq"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText4.perform(replaceText("Last Launcher Dev"));

        ViewInteraction editText5 = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText5.perform(closeSoftKeyboard());

        ViewInteraction editText6 = onView(
                allOf(withId(R.id.ed_input), withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(android.R.id.content),
                                        childAtPosition(
                                                withClassName(is("android.widget.FrameLayout")),
                                                0)),
                                0),
                        isDisplayed()));
        editText6.perform(pressImeActionButton());

        ViewInteraction appTextView4 = onView(
                allOf(withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView4.perform(scrollTo(), longClick());

        ViewInteraction textView4 = onView(
                allOf(withId(android.R.id.title), withText("Freeze Size"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView4.perform(click());

        ViewInteraction appTextView5 = onView(
                allOf(withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView5.perform(scrollTo(), longClick());

        ViewInteraction textView5 = onView(
                allOf(withId(android.R.id.title), withText("Reset Color"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView5.perform(click());

        ViewInteraction appTextView6 = onView(
                allOf(withText("Last Launcher Dev"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("android.widget.ScrollView")),
                                                0)),
                                9)));
        appTextView6.perform(scrollTo(), longClick());

        ViewInteraction textView6 = onView(
                allOf(withId(android.R.id.title), withText("Reset All"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                0),
                        isDisplayed()));
        textView6.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
