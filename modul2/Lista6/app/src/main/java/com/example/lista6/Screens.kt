package com.example.lista6

sealed class Screens(val route: String) {
    data object AssignmentsListScreen : Screens("assignmentsListScreen")
    data object GradesListScreen : Screens("gradesListScreen")
    data object ExercisesListScreen : Screens("exercisesScreen")
}