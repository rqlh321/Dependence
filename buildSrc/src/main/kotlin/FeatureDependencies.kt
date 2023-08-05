object FeatureDependencies {

    val projects = arrayOf(
        ":domain"
    )
    val libs = arrayOf(
        "com.google.dagger:hilt-android:2.46.1",
        "androidx.hilt:hilt-navigation-compose:1.0.0",
        "androidx.compose.ui:ui",
        "androidx.compose.ui:ui-graphics",
        "androidx.compose.ui:ui-tooling-preview",
        "androidx.compose.material3:material3",
    )
    val platform = arrayOf(
        "androidx.compose:compose-bom:2023.06.01"
    )
    val debugLibs = arrayOf(
        "androidx.compose.ui:ui-tooling",
        "androidx.compose.ui:ui-test-manifest"
    )
    val kapt = arrayOf(
        "com.google.dagger:hilt-compiler:2.47"
    )
}