Приложение для редактирования списка сотрудников компании.

Условия задания:

Есть сотрудники - Имя, Фамилия, Телефон, Отдел (в одном отделе может работать несколько сотрудников, каждый сотрудник может работать только в одном отделе). Данные о сотрудниках находятся в БД (схему таблиц разработайте самостоятельно)

Необходимо разработать web сервис (REST), который бы позволял:

  1.Выводить существующих сотрудников. Должна быть возможность фильтрации сотрудников по отделу.
  2.Добавлять/редактировать/удалять сотрудников. Список отделов может быть заранее определен и не подвергаться изменениям в приложении.
  3.Назначать сотрудника в отдел.
  4.Удалять сотрудника из отдела.
  5.Требования к тестовому заданию:

Тестовое задание реализуется с использованием стека: Spring JDK: >= 1.8. Тестовое задание должно полностью собираться из исходных кодов при помощи Maven / Gradle.