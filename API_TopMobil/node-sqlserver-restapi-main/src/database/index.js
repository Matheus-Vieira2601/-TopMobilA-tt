const { sql, getConnection } = require('./connection')
const querys = require('./querys')

module.exports = { querys, sql, getConnection }