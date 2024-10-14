(ns todo-cli.task)

(defprotocol Task
  (id [this] "Returns the unique id of the task")
  (task-name [this] "Returns the name of the task")
  (description [this] "Returns the description of the task")
  (status [this] "Returns the status of the task")
  (edit [this new-name new-description] "Edits the task")
  (check [this] "Marks the task as completed")
  (uncheck [this] "Marks the task as uncompleted"))

(defrecord BasicTask
           [id task-name description status]
  Task
  (id [this] (:id this))
  (task-name [this] (:task-name this))
  (description [this] (:description this))
  (status [this] (:status this))
  (edit [this new-name new-description]
    (let [{id :id
           status :status} this]
      (->BasicTask id new-name new-description status)))
  (check [this] (assoc this :status :completed))
  (uncheck [this] (assoc this :status :incomplete)))
