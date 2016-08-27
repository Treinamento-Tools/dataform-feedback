# dataform-feedback
Data analysis for employee feedback connecting with: https://www.typeform.com/help/data-api/


List of Forms

```
https://api.typeform.com/v1/forms?key=YOUR_API_KEY
```


Questions and Results
```
https://api.typeform.com/v1/form/[FORM_ID]?key=[API_KEY]&completed=true
```

Data structure

```
Form {
    id
    name
}

KeyQuestion {
    id
}

Question {
    id
    field_id
    question
}

Response {
    answers (Map<String, String>)
    completed (0/1)
    token
    metadata {
        date_submit
    }
}

EXAMPLE KEY: 528fe381849f59b83457220e3c7a3058429ecefa

```
