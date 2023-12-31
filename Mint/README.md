# Mint-News-Clone

<img src="https://images.livemint.com/static/livemint-logo-v2.svg" width="220">


## Features
* 100% Kotlin
* MVVM architecture



## Tech Stacks
* [Retrofit](http://square.github.io/retrofit/) + [OkHttp](http://square.github.io/okhttp/) - RESTful API and networking client.
    * [Room](https://developer.android.com/training/data-storage/room) - Local persistence database.
    * [ViewModel](https://developer.android.com/reference/androidx/lifecycle/ViewModel) - UI related data holder, lifecycle aware.
    * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Observable data holder that notify views when underlying data changes.
* [Glide](https://github.com/bumptech/glide) - Image loading.
* [Coroutines](https://developer.android.com/kotlin/coroutines) - Light-weight threads for background operations.
* [Swipe RefreshLAyout](https://developer.android.com/jetpack/androidx/releases/swiperefreshlayout) - Refreshing state of SwipeRefreshLayout.
* [Shimmer effect](https://facebook.github.io/shimmer-android/) - Loading animation

## Architectures

![MVVM](https://user-images.githubusercontent.com/38027375/119865827-b70c2680-bf39-11eb-8a60-85e3efa4f994.png)

We follow Google recommended [Guide to app architecture](https://developer.android.com/jetpack/guide) to structure our architecture based on MVVM, reactive UI using LiveData / RxJava observables and data binding.

* **View**: Activity/Fragment with UI-specific logics only.
* **ViewModel**: It keeps the logic away from View layer, provides data streams for UI and handle user interactions.
* **Model**: Repository pattern, data layers that provide interface to manipulate data from both the local and remote data sources. 
