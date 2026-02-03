package kz.app.commondto.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppealRequestDTO {
    private String eventId;          // Уникальный ID события для идемпотентности
    private Long clientId;         // ID клиента для поиска в Redis
    private String category;         // Категория для правил (urgent/general)
    private String topic;            // Тема обращения
    private String description;      // Детали обращения
    private LocalDateTime createdAt;
    private LocalDateTime receivedAt; // Время получения для проверки рабочего времени
}