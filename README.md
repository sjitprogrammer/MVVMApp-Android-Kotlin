# MVVMApp-Android-Kotlin



dependencies {
    implementation fileTree(dir: "libs", include: ["*.jar"])
    implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    implementation 'androidx.core:core-ktx:1.3.0'
    implementation 'androidx.appcompat:appcompat:1.1.0'
    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'

    //Retrofit and GSON
    implementation 'com.squareup.retrofit2:retrofit:2.6.2'
    implementation 'com.squareup.retrofit2:converter-gson:2.6.2'

    //Kotlin Coroutines
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3"

    // ViewModel and LiveData
    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"

    //New Material Design
    implementation 'com.google.android.material:material:1.2.0-alpha06'

    //Kodein Dependency Injection
    implementation "org.kodein.di:kodein-di-generic-jvm:6.2.1"
    implementation "org.kodein.di:kodein-di-framework-android-x:6.2.1"

    //Android Room
    implementation "androidx.room:room-runtime:2.2.5"
    implementation "androidx.room:room-ktx:2.2.5"
    kapt "androidx.room:room-compiler:2.2.5"

    //Android Navigation Architecture
    implementation "androidx.navigation:navigation-fragment-ktx:2.3.0-alpha06"
    implementation "androidx.navigation:navigation-ui-ktx:2.3.0-alpha06"

    implementation 'com.xwray:groupie:2.3.0'
    implementation 'com.xwray:groupie-kotlin-android-extensions:2.3.0'
    implementation 'com.xwray:groupie-databinding:2.3.0'

    implementation "androidx.preference:preference-ktx:1.1.1"

}
