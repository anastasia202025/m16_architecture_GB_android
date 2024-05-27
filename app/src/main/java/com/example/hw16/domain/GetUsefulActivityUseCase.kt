package com.example.hw16.domain

import com.example.hw16.data.UsefulActivitiesRepository
import com.example.hw16.data.UsefulActivityDto
import javax.inject.Inject

class GetUsefulActivityUseCase @Inject constructor(
    private val repository: UsefulActivitiesRepository
) {
    suspend fun execute(): UsefulActivityDto {
        return repository.getUsefulActivity()
    }
}