(ns task-test
  (:require [clojure.test :refer [deftest is testing]]
            [todo-cli.task :as task]))

(deftest basic-task-test
  (testing "Creates a basic task"
    (let [task (task/->BasicTask 1 "Task Name" "Task Description" :incomplete)]
      (is (= (task/id task) 1))
      (is (= (task/task-name task) "Task Name"))
      (is (= (task/description task) "Task Description"))
      (is (= (task/status task) :incomplete))))
  (testing "Can edit a task"
    (let [task (task/->BasicTask 1 "Task Name" "Task Description" :incomplete)
          expected (task/->BasicTask 1 "New Task Name" "New Task Description" :incomplete)]
      (is (= (task/edit task "New Task Name" "New Task Description") expected))))
  (testing "Can check and uncheck a task"
    (let [task (task/->BasicTask 1 "Task Name" "Task Description" :incomplete)
          checked (task/->BasicTask 1 "Task Name" "Task Description" :completed)]
      (is (= (task/check task) checked))
      (is (= (task/uncheck task) task)))))

