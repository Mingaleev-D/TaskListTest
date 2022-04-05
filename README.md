# Task List APP | Приложение Список дел

### Мингалеев Динар | Mingaleev Dinar
> Mingaleev-D92

## Description | Описание

+ Небольшое приложение в которое можно записать дела. Дела можно распределить по важности.
  + A small application in which you can record cases. Tasks can be sorted by importance.


![taskLisk](https://user-images.githubusercontent.com/61611031/161831998-508d0e92-92b2-42b2-a273-f0ad41ef39c2.gif)



## Stack | Технологии

 + ROOM
 + ConstraintLayout
 ++ LinearLayout
 ++ FrameLayout
 + RecyclerView


## Dependency | Зависимость

```kotlin

 def room_version = "2.4.2"

     implementation "androidx.room:room-runtime:$room_version"
     annotationProcessor "androidx.room:room-compiler:$room_version"

     kapt("androidx.room:room-compiler:$room_version")
     implementation("androidx.room:room-ktx:$room_version")

```
